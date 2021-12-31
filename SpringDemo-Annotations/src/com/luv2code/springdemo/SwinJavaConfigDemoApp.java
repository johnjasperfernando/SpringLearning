package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwinJavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportsConfig.class);
		SwimCoach theCoach=context.getBean("SwimCoach",SwimCoach.class);
		System.out.println(theCoach.getDailyWorkkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println("email:"+theCoach.getEmail());
		System.out.println("team:"+theCoach.getTeam());
		context.close();
	}

}
