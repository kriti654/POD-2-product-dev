package com.sapient.store.app;

import static springfox.documentation.builders.PathSelectors.regex;
import java.util.function.Predicate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication(scanBasePackages = "com.sapient")
@EntityScan(basePackages = "com.sapient.store.entity")
@EnableJpaRepositories(basePackages = "com.sapient.store.dao")
@EnableAspectJAutoProxy
@EnableOpenApi
@EnableDiscoveryClient
public class StoreDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreDemoApplication.class, args);
	}

     @Bean
	  public Docket openApiPetStore() {
	    return new Docket(DocumentationType.OAS_30)
	        .groupName("open-api-online-food-delivary")
	        .select()
	        .paths(notePaths())
	        .build();
	  }

	  private Predicate<String> notePaths() {
	    return regex(".*/v1/.*");
	  }
}
