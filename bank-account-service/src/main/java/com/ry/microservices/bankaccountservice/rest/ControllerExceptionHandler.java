package com.ry.microservices.bankaccountservice.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.ry.microservices.bankaccountservice.service.InvalidAccountBalanceException;




@ControllerAdvice
public class ControllerExceptionHandler {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(InvalidAccountBalanceException.class)
	public void handleNotFound() {
	}

	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) // 500
	@ExceptionHandler(Exception.class)
	public void handleGeneralError(Exception ex) {
		//log.error("An error occurred procesing request", ex);
	}

}
