package com.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins on batting practise";
	}

	@Override
	public String getDailyFortune() {
		//use my fortuneServce to get a fortune
		return fortuneService.getFortune() ;
	}
	
	public void doMyStartupStuff()
	{
		System.out.println("inside init method");
	}
	
	public void doMyDestroyStuff() 
	{
		System.out.println("inside destroy method");
	}
}
