package com.nt.beans;

public final class Vehicle {
	private Engine engine;
	
	public Vehicle() {
		System.out.println("Vehicle:: 0-param constructor");
	}
	
    //setter method supporting setter Injection
	public void setEngine(Engine engine) {
		System.out.println("Vehicle.setEngine()");
		this.engine = engine;
	}
	
	public void  journey(String sourcePlace, String destPlace) {
		System.out.println("Vehicle.journey()");
		engine.start();
		System.out.println("Jouenry started from :::"+sourcePlace);
		System.out.println("\n\n Journey is going on..........\n\n");
		engine.stop();
		System.out.println("Journey ended at :::"+destPlace);
		
	}
	
	

}
