package com.nt.beans;

public class A {
	private B b;

	public A(B b) {
		System.out.println("A: 1-param constructor");
		this.b = b;
	}

	/*public void setB(B b) {
		System.out.println("A.setB()");
		this.b = b;
	}*/
	
	

	public A() {
		System.out.println("A:: 0-param constructor");
	}

	@Override
	public String toString() {
		return "A [b=  ]";
	}

}
