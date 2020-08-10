package com.core.springCore;

import org.springframework.stereotype.Component;

@Component("morningGreeting")
public class MorningGreeting implements Greeting{
	
	String greeting = "Good Morning";
	public String greet() {
		// TODO Auto-generated method stub
		return greeting;
	}
	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public MorningGreeting() {
		
	}
    

}
