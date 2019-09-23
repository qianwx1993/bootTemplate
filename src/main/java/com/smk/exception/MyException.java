package com.smk.exception;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Version 1.0
 * @Since JDK1.8
 * @Author HYK
 * @Date 2018/12/6 0006 15:26
 */
@Data
@Slf4j
public class MyException extends RuntimeException {

	private String code;

	public MyException(String msg) {
		super(msg);
		this.code = code;
	}

}
