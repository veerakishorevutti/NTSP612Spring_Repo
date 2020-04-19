package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private Courier courier;
	

	public Flipkart() {
	  System.out.println("Flipkart:: 0-param constructor");
	}
	

	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier(-)");
		this.courier = courier;
	}


	public Flipkart(Courier courier) {
		System.out.println("Flipkart:1-param constructor");
		this.courier = courier;
	}


	public String shopping(String items[],float prices[]) {
		float billAmt=0.0f;
		Random rad=null;
		int orderId=0;
		String status=null;
		//generate billAmt
		for(float p:prices) {
			billAmt=billAmt+p;
		}
		//generated order id
		rad=new Random();
		orderId=rad.nextInt(100000);
		//deliver product
		status=courier.deliver(orderId);
		return Arrays.toString(items)+" with prices"+Arrays.toString(prices)+" having bill Amt::"+billAmt+"--> "+status;
		
	}

	
}
