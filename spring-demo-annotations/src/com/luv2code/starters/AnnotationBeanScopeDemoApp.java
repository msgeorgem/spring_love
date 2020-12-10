package com.luv2code.starters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.config.MyLoggerConfig;
import com.luv2code.springdemo.Coach;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// get the bean from spring container
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);

		// call a method on the bean
		System.out.println("\nPointing to the same object:" + result);
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		// close the context
		context.close();
	
//		MyLoggerConfig dff = new MyLoggerConfig();
//		dff.initLogger();
	}

}
