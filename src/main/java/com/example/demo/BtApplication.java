package com.example.demo;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.service.MathService;

@SpringBootApplication
public class BtApplication {

	@Autowired
	private MathService mathService;
	
	public static void main(String[] args) {
		SpringApplication.run(BtApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner runner() {
		return args -> {
			System.out.println("Hello, Spring Boot!");
			Stream<Long> fs = mathService.factorialStream();
			fs.limit(10).forEach(System.out::println);
		};
	}
}
