package com.wipro.sandhya.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI questionServiceOpenAPI() {
		return new OpenAPI().info(new Info().title("Question Management API")
				.description("API documentation for Question Management System").version("1.0.0"));
	}

	// Optional: Limit scanning to a specific package
	@Bean
	public GroupedOpenApi publicApi() {
		return GroupedOpenApi.builder().group("questions").packagesToScan("com.example.questionService.controller") 
																											
																											
				.build();
	}
}
