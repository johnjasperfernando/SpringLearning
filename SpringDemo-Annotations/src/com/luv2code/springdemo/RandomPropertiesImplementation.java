package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class RandomPropertiesImplementation implements Coach {

	@Autowired
	private RandomFortuneService randomFortuneService;
	
	@Value("${foo.GoodFortune}")
	private String goodFortune;
	
	@Value("${foo.BetterFortune}")
	private String betterFortune;
	
	@Value("${foo.BadDay}")
	private String badFortune;
	
	private Random random= new Random();
	
	private String FileName="src/FortuneData.txt";
	
	private List<String> theFortunes;
	
	private Random myRandom = new Random();
	
	@Override
	public String getDailyWorkkout() {
		
		File theFile = new File(FileName);
		theFortunes = new ArrayList<String>();
		
		try (BufferedReader br = new BufferedReader(
				new FileReader(theFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());
		//int index=random.nextInt(3);
		/*if(index==0)return goodFortune;
		if(index==1)return betterFortune;
		else return badFortune;*/
		
		int index = myRandom.nextInt(theFortunes.size());

		String tempFortune = theFortunes.get(index);
		return tempFortune;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return randomFortuneService.getFortune();
	}

}
