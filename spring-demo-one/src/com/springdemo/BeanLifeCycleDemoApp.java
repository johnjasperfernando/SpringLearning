package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScope-ApplicationContext.xml");
		Coach theCoach=context.getBean("myCoach",Coach.class);
		Coach alphaCoach=context.getBean("myCoach",Coach.class);
		boolean result=(theCoach==alphaCoach);
		System.out.println("the objects are same or not:" +result);
		System.out.println("the memory location for theCoach:" +theCoach); 
		System.out.println("the memory location for theCoach:" +alphaCoach +"\n"); 
	}

}
