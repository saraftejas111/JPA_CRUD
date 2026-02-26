package com.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaReactCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaReactCrudApplication.class, args);
		
		System.err.println("app started..");
	}

}
