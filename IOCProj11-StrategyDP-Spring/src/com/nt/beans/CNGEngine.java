package com.nt.beans;

public class CNGEngine implements Engine {
	public CNGEngine() {
		System.out.println("CNGEngine:: 0-param constructor");
	}

	@Override
	public void start() {
		System.out.println("CNGEngine.start():: Engine started");
		
	}

	@Override
	public void stop() {
		System.out.println("CNGEngine.stop():: Engine stopped");
		
	}

}
