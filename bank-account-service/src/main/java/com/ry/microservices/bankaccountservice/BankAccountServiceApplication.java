package com.ry.microservices.bankaccountservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankAccountServiceApplication {

	//git location :: https://github.com/rahulyadav20/springboot-config-server/tree/master/configuration
	//Call the service to print existing bank accounts.
	//http://localhost:8080/bank-account/A12345
	/* go to the folder run below commands after modifying the prop file.
	 * 
	 * git add bank-account-service-dev.properties
	 * git commit -m "modifying dev prop file"
	 * git push
	 * un: rahulyadav20@gmail.com
	 * pwd: Mango@2003
	 */
	//http://localhost:8080/actuator/refresh --Call this with POST method to get updated git version file
	
	/*
	 * Issues:
	 * 1. spring.cloud.config.uri should be in bootstrap.prop keeping it in application.prop won't pick
	 * this URI and default uri of localhost:8888 will be picked instead.
	 * 
	 * 2. careful with property name typo.
	 * 3. actuator returning 404
	 */
	public static void main(String[] args) {
		SpringApplication.run(BankAccountServiceApplication.class, args);
	}
}
