package com.luv2code.starters;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.config.GreatConfig;
import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.GreatCoach;
import com.luv2code.springdemo.SwimCoach;

public class GreatJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(GreatConfig.class);
		
		// get the bean from spring container
		Coach theCoach = context.getBean("greatCoach",Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
				
		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
			
		// close the context
		context.close();
		
	}

}


