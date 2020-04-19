package com.nt.beans;

import java.util.Date;

public class PersonProfile {
	private long adhaarNo;
	private String name;
	private float age;
	private Date dob,doj,dom;
	public PersonProfile(long adhaarNo, String name, float age, Date dob, Date doj, Date dom) {
        System.out.println("PersonProfile::6-param constructor");
		this.adhaarNo = adhaarNo;
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.doj = doj;
		this.dom = dom;
	}
	
	@Override
	public String toString() {
		return "PersonProfile [adhaarNo=" + adhaarNo + ", name=" + name + ", age=" + age + ", dob=" + dob + ", doj="
				+ doj + ", dom=" + dom + "]";
	}
	
}
