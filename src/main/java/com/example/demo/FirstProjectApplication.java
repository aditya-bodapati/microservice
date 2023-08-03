package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		 
		ConfigurableApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);
		
     	Aditya a = context.getBean(Aditya.class);
		
		a.display();
		
     	Aditya a1 = context.getBean(Aditya.class);
		
		a1.display();

	}
}