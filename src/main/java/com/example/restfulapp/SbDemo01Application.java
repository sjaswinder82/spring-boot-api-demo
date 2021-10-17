package com.example.restfulapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

public class SbDemo01Application {

	public static void main(String[] args) {
		SpringApplication.run(SbDemo01Application.class, args);
	}

}
