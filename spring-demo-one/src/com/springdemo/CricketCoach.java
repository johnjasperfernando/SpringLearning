package com.springdemo;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	private String team;
	private String email;
	
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
//		System.out.println(team);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
//		System.out.println(email);
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practise 10 overs of bowling";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	

}
