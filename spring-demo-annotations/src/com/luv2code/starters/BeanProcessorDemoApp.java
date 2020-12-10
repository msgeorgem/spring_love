package com.luv2code.starters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Coach;

public class BeanProcessorDemoApp {

	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");	
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		System.out.println("Daily workout: " + theCoach.getDailyWorkout());

		// close the context
		context.close();
	}

}








