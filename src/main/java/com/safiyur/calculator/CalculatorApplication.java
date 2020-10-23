package com.safiyur.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		System.out.println("hello jenkins");
		SpringApplication.run(CalculatorApplication.class, args);
	}

}
