package com.krish.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var app = new SpringApplication(DemoApplication.class);
		app.setDefaultProperties(Collections.singletonMap("spring.profiles.active", "prod"));
		var ctx = app.run(args);
//		FirstClass firstClass = new FirstClass();
//		FirstClass firstClass = ctx.getBean("myBean", FirstClass.class);
//		System.out.println(firstClass.sayHello());
		FirstService firstService = ctx.getBean(FirstService.class);
		System.out.println(firstService.saySomething()
							+"\n"+firstService.getJavaVersion()
							+"\n"+firstService.getOsName()
							+"\n"+firstService.readCustomPropEnv()
							+"\n\n"+firstService.getCustomProperty()
							+"\n"+firstService.getCustomPropFromOtherFile()
							+"\n"+firstService.getCustomPropFromAnotherFile()
							);
		System.out.println("Integer from .properties file: "+firstService.getCustomPropNumber());
		System.out.println(

		);
	}

//	@Bean
//	public FirstClass firstClass() {
//		return new FirstClass();
//	}
}