package com.smk.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.smk.common.ErrorCode;
import com.smk.form.local.req.FaceDataUpReqForm;
import com.smk.form.local.res.BaseResForm;
import com.smk.model.topzf.BiRealnameLog;
import com.smk.service.BiRealnameLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * his Controller
 * @Version 1.0
 * @Since JDK1.8
 * @Author Qian
 * @Company Bangsun
 * @Date 2019/9/19 10:19
 */
@Slf4j
@RestController
@RequestMapping("smkhis")
public class SmkhisController {

	@Resource
	private BiRealnameLogService biRealnameLogService;
	/**
	 * 医保人脸验证结果上传
	 * @param form
	 * @param bindingResult
	 * @return
	 */
	@PostMapping("faceDataUp")
	public BaseResForm faceDataUp(@Valid @RequestBody FaceDataUpReqForm form, BindingResult bindingResult) {
		if (bindingResult.hasErrors()){
			String errMsg = bindingResult.getFieldError().getDefaultMessage();
			return BaseResForm.back(ErrorCode.PARAM_WRONG.code, errMsg);
		}

		JSONObject jsonObject = (JSONObject) JSON.toJSON(form);
		BiRealnameLog biRealnameLog = JSONObject.parseObject(jsonObject.toJSONString(), BiRealnameLog.class);

		biRealnameLogService.saveBiRealnameLog(biRealnameLog);
		return BaseResForm.success();
	}
	}
