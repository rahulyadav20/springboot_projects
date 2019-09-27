package com.ry.microservices.bankaccountservice.rest;

import java.net.URI;
import java.net.URISyntaxException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ry.microservices.bankaccountservice.config.Configuration;
import com.ry.microservices.bankaccountservice.model.BankAccount;
import com.ry.microservices.bankaccountservice.service.BankAccountService;



///https://dzone.com/articles/configuring-micro-services-spring-cloud-config-ser
@RestController

public class BankAccountController {

	@Autowired
	public BankAccountService bankAccountService; 
	@Autowired
	private Configuration configuration;
	
	
	@PostMapping("/bank-account")
	public ResponseEntity<?> createBankAccount(@RequestBody BankAccount bankAccount, HttpServletRequest request) throws URISyntaxException {
		
		bankAccountService.createBankAccount(bankAccount);
		
		//log.info("created bank account {}", bankAccount);
		
		URI uri = new URI(request.getRequestURL() + "bank-account/" + bankAccount.getAccountId());
		
		return ResponseEntity.created(uri).build();				
	}
	
	
	@GetMapping("/bank-account/{accountId}")
	public ResponseEntity<BankAccount> getBankAccount(@PathVariable("accountId") String accountId){
		
		BankAccount account = bankAccountService.retrieveBankAccount(accountId);
		System.out.println("Min Balance ::"+configuration.getMinBalance());
		System.out.println("Max Balance ::"+configuration.getMaxBalance());
		
		
		//log.info("retrieved bank account {}", account);
		
		return ResponseEntity.ok(account);				
	}
	
}
