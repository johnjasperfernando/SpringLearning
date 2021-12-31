package com.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		String fortune[]=new String[3];
		fortune[0]="Today is your lucky day";
		fortune[1]="Today is an average day";
		fortune[2]="Today be carefull";
		Random r=new Random();
		
		return fortune[r.nextInt(3)];
	}

}
