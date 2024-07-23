package com.krish.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(DemoApplication.class, args);
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
	}

//	@Bean
//	public FirstClass firstClass() {
//		return new FirstClass();
//	}
}