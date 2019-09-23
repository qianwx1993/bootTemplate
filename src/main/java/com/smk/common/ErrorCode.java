package com.smk.common;

public enum ErrorCode {
	SUCCESS("00", "success"),
	PARAM_WRONG("E1","param wrong"),

	SYSTEM_ERROR("EE", "system error");

	public String code;

	public String desc;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	private ErrorCode(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}
}
