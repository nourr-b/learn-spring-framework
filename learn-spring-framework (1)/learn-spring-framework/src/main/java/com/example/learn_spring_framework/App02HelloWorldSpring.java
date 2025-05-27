package com.example.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.learn_spring_framework.game.GameRunner;
import com.example.learn_spring_framework.game.MarioGame;
import com.example.learn_spring_framework.game.Pacman;
import com.example.learn_spring_framework.game.SuperContraGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//Launch a spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		//configure the things that we want spring to manage @configuration class
		//retrieving beans managed by spring
		System.out.println(context.getBean("name"));
	}

}