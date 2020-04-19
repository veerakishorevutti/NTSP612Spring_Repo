package com.nt.comps;

public final class DieselEngine implements Engine {
	
	public DieselEngine() {
	 System.out.println("DiselEngine:: 0-param constructor");
	}

	@Override
	public void start() {
      System.out.println("DiselEngine.start():: Engine started");	
	}

	@Override
	public void stop() {
		System.out.println("DiselEngine.stop():: Engine stopped");

	}

}
