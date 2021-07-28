package com.sapient.usermanagement.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;



@SpringBootApplication(scanBasePackages = "com.sapient")
@EntityScan(basePackages = "com.sapient.usermanagement.entity")
@EnableSwagger2
public class UserManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementApplication.class, args);
	}
	
}
