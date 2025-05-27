package com.example.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//configure the things that we want spring to manage @configuration class
@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Nour";
	}
}
