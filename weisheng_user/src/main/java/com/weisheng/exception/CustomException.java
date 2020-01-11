package com.weisheng.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.weisheng.common.entity.Result;
import com.weisheng.common.entity.StatusCode;

@ControllerAdvice
public class CustomException {

	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public Result error(Exception e) {
		e.printStackTrace();
		return new Result(false,StatusCode.ERROR,e.getMessage());
	}
	
}
