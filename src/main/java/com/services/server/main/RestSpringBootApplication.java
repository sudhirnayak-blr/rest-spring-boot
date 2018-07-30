package com.services.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages= {"com.services.crud.controller"})

@SpringBootApplication
public class RestSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestSpringBootApplication.class, args);
	}
}
