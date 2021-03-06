package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportsConfig.class);
		Coach theCoach=context.getBean("SwinCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkkout());
		System.out.println(theCoach.getDailyFortune());
		context.close();
	}

}
