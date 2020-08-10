package com.core.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GreeterService {
	@Autowired
	@Qualifier("goodDayGreeting")
	Greeting gref;
	void printGreeting()
	{
		System.out.println(gref.greet());
	}

	

}
