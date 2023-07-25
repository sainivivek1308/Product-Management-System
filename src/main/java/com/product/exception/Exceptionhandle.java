package com.product.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Exceptionhandle {
	
	@ExceptionHandler(Exception.class)
	public String Error() {
		return "error";
	}
}
