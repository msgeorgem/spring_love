package com.luv2code.springdemo;

public class GreatCoach implements Coach {

	
	private FortuneService fortuneServce;
	
	public GreatCoach(FortuneService fortuneServce) {
		super();
		this.fortuneServce = fortuneServce;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "1000 situps";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneServce.getFortune();
	}

}
