package com.krish.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {
    @Bean
	@Qualifier("bean1")
	@Profile("dev")
	public FirstClass firstBean() {
		return new FirstClass("First Bean...");
	}

	@Bean
	@Qualifier("bean2")
	@Profile("prod")
	public FirstClass secondBean() {
		return new FirstClass("Second Bean...");
	}

	@Bean
	@Qualifier("bean3")
	@Primary
	public FirstClass thirdBean() {
		return new FirstClass("Third Bean...");
	}

//	@Bean
//	@Profile("dev")
//	public  FirstClass ofDevEnv() {
//		return new FirstClass("DEV environment - Bean");
//	}
//
//	@Bean
//	@Profile("test")
//	public FirstClass ofTestEnv() {
//		return new FirstClass("TEST environment - Bean");
//	}
//
//	@Bean
//	@Profile("prod")
//	public FirstClass ofProdEnv() {
//		return new FirstClass("PROD environment - Bean");
//	}
}
