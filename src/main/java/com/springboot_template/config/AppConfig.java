package com.springboot_template.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.springboot_template.services.ExampleService;

@Configuration
// @Import(SpringBootActuatorConfig.class)
public class AppConfig {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public ExampleService getExampleService() {
		return new ExampleService();
	}
}
