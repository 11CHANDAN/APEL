package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApelTestApplication {
	//module layer is used to create entity class
	//repo layer is used to perform crud operation
	//controller is used to accept user data and store valid data inside database
	public static void main(String[] args) {
		SpringApplication.run(ApelTestApplication.class, args);
	}

}
