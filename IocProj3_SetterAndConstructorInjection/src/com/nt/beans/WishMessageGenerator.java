package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
	//Variable declaration
	private Date date=null;
	//Setter Method
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0-param constructor");
	}
	public void setDate(Date date) {
		System.out.println(date);
		System.out.println("WishMessageGenerator.setDate()::Setter");
		this.date = date;
	}
	//1-param Constructor
	public WishMessageGenerator(Date date) {
		System.out.println(date);
		System.out.println("WishMessageGenerator::1-param constructor");
		this.date=date;
	}
	//Business Logic
	public String GenerateWishMessage(String user) {
		int hour=0;
		//getting correct hour of the Day
		hour=date.getHours();
		//generate wish Message Based on time
		if(hour<12) {
			return "Good Morning::--->>>>>> "+user;
		}
		else if(hour<16) {
			return "Good After Noon::--->>>>>> "+user;
		}
		else if(hour<20) {
			return "Good Evening::--->>>>>> "+user;
		}
		else {
			return "Good Nigght:: --->>>>>>"+user;
		}
	}
	

}
