package com.luv2code.springdemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
@Scope("prototype")
public class TennisCoach implements Coach, DisposableBean {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneServce;
	
	public TennisCoach() {
		System.out.println("TennisCoach: inside default constructor");
	}
	
	
	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
		System.out.println(fortuneServce.getFortune());
		}
		
	// define my destroy method
//	@PreDestroy
//	public void doMyCleanupStuff() {
//		System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");		
//		}
	
	
	
	@Override
	public void destroy() throws Exception {
		System.out.println(">> TennisCoach: inside destroy()");
		
	}
	/*
	@Autowired
	public void doSome(FortuneService fortuneServce) {
		System.out.println("TennisCoach: inside doSome");
		this.fortuneServce = fortuneServce;}

	
	@Autowired
	public TennisCoach(FortuneService fortuneServce) {
		super();
		this.fortuneServce = fortuneServce;
	}
	*/


	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneServce.getFortune();
	}

	
	
	

}
