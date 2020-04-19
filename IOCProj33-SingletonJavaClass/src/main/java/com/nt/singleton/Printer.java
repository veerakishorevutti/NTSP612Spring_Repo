package com.nt.singleton;

public class Printer {
	private static Printer INSTANCE;

	private Printer() {
		//no operation
		System.out.println("Printer::0=param constructor");
	}
	
	//static Factory method
	public static Printer getInstance() {
		if(INSTANCE==null)
			INSTANCE=new Printer();
		return INSTANCE;
	}
	
	//B.method
	public void printMessage(String msg) {
		System.out.println(msg+" printed on paper");
	}
}
