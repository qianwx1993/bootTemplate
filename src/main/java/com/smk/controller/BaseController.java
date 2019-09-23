package com.smk.controller;

import com.alibaba.fastjson.JSONObject;
import com.smk.form.local.req.BaseReqForm;
import com.smk.form.local.res.BaseResForm;
import com.smk.model.mcap.BiTxnDetailTb;
import com.smk.service.BiTxnDetailTbService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Version 1.0
 * @Since JDK1.8
 * @Author HYK
 * @Date 2019/1/29 0029 16:35
 */
@RestController
public class BaseController {

	@Resource
	private BiTxnDetailTbService biTxnDetailTbService;

	/**
	 * 检查商户状态
	 *
	 * @param reqForm 接收数据
	 * @return 商户信息
	 */
	public JSONObject checkAppId(BaseReqForm reqForm) {
		//bimchntinftb 商户信息表   bimchntmsgtypemaptb 商户信息与接口对应表

		// 检查商户号状态
		// 检查商户号和接口类型的绑定关系
		return null;
	}

	/**
	 * 保存接收日志
	 *
	 * @param reqForm 接收信息
	 * @return 保存的日志信息主键
	 */
	public String saveReceiveLog(BaseReqForm reqForm) {
		// 保存到bitxndetailtb 日志表
		BiTxnDetailTb biTxnDetailTb = new BiTxnDetailTb();
		return biTxnDetailTbService.save(biTxnDetailTb);
	}

	/**
	 * 更新返回日志
	 *
	 * @param id      保存的日志信息主键
	 * @param resForm 返回信息
	 */
	public void saveReturnLog(String id, BaseResForm resForm) {
		// 更新bitxndetailtb 日志表
		BiTxnDetailTb biTxnDetailTb = new BiTxnDetailTb();
		biTxnDetailTbService.update(biTxnDetailTb);
	}

}
