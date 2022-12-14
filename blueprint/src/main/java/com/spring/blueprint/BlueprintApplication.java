package com.spring.blueprint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlueprintApplication {

	public static void main(String[] args) {
		System.out.print("blueprint"); 
		
		SpringApplication.run(BlueprintApplication.class, args);

		
	}

}
