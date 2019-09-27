package com.ry.microservices.bankaccountservice.service;

public class InvalidAccountBalanceException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidAccountBalanceException(String msg) {
		super(msg);
	}
	
}
