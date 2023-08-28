package com.example.Swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "USER DETAILS",
				version = "1.1.2",
				description = "USER DESCRIPTION",
				contact = @Contact(
						name = "User Name"
						
						)
				)
		)
public class SwaggerApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
	}

}
