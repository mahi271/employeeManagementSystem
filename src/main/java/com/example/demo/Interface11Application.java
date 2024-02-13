package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.example.demo","com.controller","com.dao","com.service","com.model"})
@EntityScan("com.model")
@EnableJpaRepositories(basePackages="com.dao")

public class Interface11Application {

	public static void main(String[] args) {
		SpringApplication.run(Interface11Application.class, args);
	}

}
