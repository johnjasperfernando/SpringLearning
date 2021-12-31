package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/*
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * this.fortuneService=fortuneService;; }
	 */
	/*
	 * @Autowired public void doSomeCtazyStuff(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */
	
	@Override
	public String getDailyWorkkout() {
		
		return "Practise your BackHand Volley";
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
