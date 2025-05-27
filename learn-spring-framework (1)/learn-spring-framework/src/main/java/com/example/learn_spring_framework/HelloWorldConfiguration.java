package com.example.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name,int age) {};
record Address(String firstLine,String city) {};
//configure the things that we want spring to manage @configuration class
@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Nour";
	}
	
	@Bean
	public int age() {
		return 23;
	}
	@Bean
	public Person person() {
		var person = new Person("nornor",25);
		return person;
	}
	
	@Bean(name="address2") 
	public Address address()
	{
		return new Address("egypt","alex");
	}
}
