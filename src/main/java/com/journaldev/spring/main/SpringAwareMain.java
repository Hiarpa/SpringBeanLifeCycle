package com.journaldev.spring.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.journaldev.spring.service.MyAwareService;

@SpringBootApplication
public class SpringAwareMain {

	public static void main(String[] args) {
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aware.xml");
//
//		ctx.getBean("myAwareService", MyAwareService.class);
//
//		ctx.close();
		SpringApplication.run(MyAwareService.class, args);
	}

}
