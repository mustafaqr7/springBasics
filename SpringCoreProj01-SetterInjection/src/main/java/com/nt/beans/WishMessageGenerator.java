package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	// HAS-A property (supporting composition / injection )
	private Date date;
	
	// setter method supporting Setter Injection
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}
	
	//b.method
	public String generateMessage(String user) {
		System.out.println("WishMessageGenerator.generateMessage()");
		//get current hour of the day
		int hour = date.getHours(); // gives 0 - 23
		//generate wish message
		if( hour < 12 )
			return "Good Morning:"+user;
		else if(hour < 16)
			return "Good Afternoon:"+user;
		else if(hour < 20)
			return "Good Evening:"+user;
		else
			return "Good Night:"+user;
	}
} 