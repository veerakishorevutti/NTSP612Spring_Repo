package com.nt.comps;

public final class Vehicle {
	private Engine engine;
	
	public Vehicle() {
		System.out.println("Vehicle:: 0-param constructor");
	}

	public void setEngine(Engine engine) {
		System.out.println("Vehicle.setEngine(-)");
		this.engine = engine;
	}
	
	public  void jounery(String source,String dest) {
		engine.start();
		System.out.println("Jounery stared from::"+source);
		System.out.println();
		System.out.println("Jounery is going on......");
		System.out.println();
		engine.stop();
		System.out.println("Jounery ended at::"+dest);
	}

	

}
