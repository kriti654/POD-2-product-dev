package com.example.eureka.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StoreEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreEurekaServiceApplication.class, args);
	}

}
