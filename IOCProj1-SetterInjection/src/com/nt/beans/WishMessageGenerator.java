//WishMessageGenerator.java (Target class--POJO class)
package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;
	
	public WishMessageGenerator() {
        System.out.println("WishMessageGenerator::0-param constructor");

	}
	
	public void  setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate(-)");
		this.date=date;
	}
	
	//b.method
	public String generateWishMessage(String user) {
		int  hour=0;
		//get current hour of the day
		hour=date.getHours();
		//generates wish message
		if(hour<12)
			return "Good Morning::"+user;
		else if (hour<16)
			return "Good AfterNoon::"+user;
		else if(hour<20)
			return "Good Evening::"+user;
		else
			return "Good Night::"+user;
	}//method
}//class
