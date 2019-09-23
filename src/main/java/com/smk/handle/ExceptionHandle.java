package com.smk.handle;

import com.smk.common.ErrorCode;
import com.smk.exception.MyException;
import com.smk.form.local.res.BaseResForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @Version 1.0
 * @Since JDK1.8
 * @Author HYK
 * @Date 2018/12/6 0006 15:28
 */
@Slf4j
@ControllerAdvice
public class ExceptionHandle {

	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public BaseResForm resultHandle(Exception e) {
		if (e instanceof MyException) {
			MyException myException = (MyException) e;
			return BaseResForm.back(myException.getCode(), myException.getMessage());
		} else {
			StringWriter stringWriter = new StringWriter();
			e.printStackTrace(new PrintWriter(stringWriter, true));
			log.error("[系统异常]:{}", stringWriter.toString());
			return BaseResForm.back(ErrorCode.SYSTEM_ERROR);
		}
	}

}
