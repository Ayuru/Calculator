package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);

		int a = 39;
		int b = 8;

		Calculator calculator = new Calculator();
		int addingResult = calculator.add(a, b);
		int subtractingResult = calculator.subtract(a, b);
		System.out.println("Result 1: " + addingResult);
		System.out.println("Result 2: " + subtractingResult);
	}

}
