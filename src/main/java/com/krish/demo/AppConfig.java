package com.krish.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
    @Bean
//	@Qualifier("bean1")
	public FirstClass firstClass() {
		return new FirstClass("First Bean...");
	}

	@Bean
//	@Qualifier("bean2")
	public FirstClass secondClass() {
		return new FirstClass("Second Bean...");
	}

	@Bean
//	@Qualifier("bean3")
	@Primary
	public FirstClass thirdClass() {
		return new FirstClass("Third Bean...");
	}
}
