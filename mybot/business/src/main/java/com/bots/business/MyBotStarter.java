package com.bots.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.bots" })
public class MyBotStarter {

	public static void main(String[] args) {
		SpringApplication.run(MyBotStarter.class, args);
	}

}
