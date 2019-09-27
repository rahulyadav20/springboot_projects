package com.ry.config.configclient;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "bank-account-service")
public class Configuration {

	private Double minBalance;

	private Double maxBalance;
	
	private String message;

	public Double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(Double minBalance) {
		this.minBalance = minBalance;
	}

	public Double getMaxBalance() {
		return maxBalance;
	}

	public void setMaxBalance(Double maxBalance) {
		this.maxBalance = maxBalance;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}	

}
