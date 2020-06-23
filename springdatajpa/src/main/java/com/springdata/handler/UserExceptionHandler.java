package com.springdata.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.springdata.exception.InvalidException;

@RestControllerAdvice
public class UserExceptionHandler {
	
	@ExceptionHandler
	public String handleInvalidException(InvalidException exception) {
		
		return exception.getMessage();
	}

}
