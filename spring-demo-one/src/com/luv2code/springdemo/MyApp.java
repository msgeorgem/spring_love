package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {

		// create the object
		//Coach theCoach1 = new BaseballCoach();
		Coach theCoach = new TrackCoach();
		
		// use the object
		//System.out.println(theCoach1.getDailyWorkout());
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
	}

}
