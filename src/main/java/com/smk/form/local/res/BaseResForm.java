package com.smk.form.local.res;

import com.smk.common.ErrorCode;
import lombok.Data;

/**
 * @Version 1.0
 * @Since JDK1.8
 * @Author HYK
 * @Date 2018/12/6 0006 15:19
 */
@Data
public class BaseResForm {

	private String respCode;

	private String respMsg;

	private Object respData;

	public static BaseResForm success() {
		BaseResForm baseResForm = new BaseResForm();
		baseResForm.setRespCode(ErrorCode.SUCCESS.code);
		baseResForm.setRespMsg(ErrorCode.SUCCESS.desc);
		baseResForm.setRespData("");
		return baseResForm;
	}

	public static BaseResForm success(Object data) {
		BaseResForm baseResForm = new BaseResForm();
		baseResForm.setRespCode(ErrorCode.SUCCESS.code);
		baseResForm.setRespMsg(ErrorCode.SUCCESS.desc);
		baseResForm.setRespData(data);
		return baseResForm;
	}

	public static BaseResForm back(String code, String msg) {
		BaseResForm baseResForm = new BaseResForm();
		baseResForm.setRespCode(code);
		baseResForm.setRespMsg(msg);
		baseResForm.setRespData("");
		return baseResForm;
	}

	public static BaseResForm back(ErrorCode errorCode) {
		BaseResForm baseResForm = new BaseResForm();
		baseResForm.setRespCode(errorCode.getCode());
		baseResForm.setRespMsg(errorCode.getDesc());
		baseResForm.setRespData("");
		return baseResForm;
	}

}
