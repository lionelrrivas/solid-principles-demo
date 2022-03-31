package com.lionelrivas.solidprinciplesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.lionelrivas")
public class SolidPrinciplesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolidPrinciplesDemoApplication.class, args);
	}

}
