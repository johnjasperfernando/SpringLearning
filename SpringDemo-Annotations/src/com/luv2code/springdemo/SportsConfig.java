package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sports.properties")
public class SportsConfig {
	
	@Bean
	public FortuneService randomFortuneService() {
		return new RandomFortuneService();
	}
	
	@Bean
	public Coach SwimCoach()
	{
		return new SwimCoach(randomFortuneService());
	}

}
