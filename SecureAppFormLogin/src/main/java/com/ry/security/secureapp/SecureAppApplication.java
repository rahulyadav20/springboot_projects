package com.ry.security.secureapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/* 19 July 2019
Spring Boot application demonstrates the Spring Security features.
	1. Login page
	2. Authentication with in memory credentials.
	3. Authentication with Oracle DB no encryption.
	4. Authentication with Oracle DB BCrypt.
	5. Authentication with OAuth.
	
	Reference : https://www.youtube.com/watch?v=2VKeCZsRNZk&list=PLsyeobzWxl7o-Ul7lhFb9-fLjDYapcetO&index=5
 
*/
@SpringBootApplication
public class SecureAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureAppApplication.class, args);
	}

}

