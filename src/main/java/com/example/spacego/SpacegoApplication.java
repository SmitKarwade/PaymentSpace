package com.example.spacego;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpacegoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpacegoApplication.class, args);
	}

}
