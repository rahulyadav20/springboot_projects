package com.ry.microservices.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

//https://dzone.com/articles/configuring-micro-services-spring-cloud-config-ser
//git local repo C:\MyData\Docs\StudyMaterial\Coding_exercise\springboot_projects\git_repo\springboot-config-server
//remote :: https://github.com/rahulyadav20/springboot-config-server/tree/master/configuration
/*
Use below URLs to test if server is properly configured or not. These urls will print the contect of property
files
*/
//http://localhost:8091/bank-account-service/default
//http://localhost:8091/bank-account-service/dev
//http://localhost:8091/bank-account-service/uat

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
