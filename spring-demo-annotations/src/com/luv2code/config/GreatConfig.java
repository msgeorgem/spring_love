package com.luv2code.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;
import com.luv2code.springdemo.GreatCoach;
import com.luv2code.springdemo.HappyFortuneService;
import com.luv2code.springdemo.SadFortuneService;
import com.luv2code.springdemo.SwimCoach;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
//@PropertySource("classpath:sport.properties")
public class GreatConfig {
	
	// define bean for our sad fortune service
		@Bean
		public FortuneService happyFortuneService() {
			return new HappyFortuneService();
		}
		
		// define bean for our swim coach AND inject dependency
		@Bean
		public Coach greatCoach() {
			GreatCoach myGreatCoach = new GreatCoach(happyFortuneService());
			return myGreatCoach;
		}
	
}
