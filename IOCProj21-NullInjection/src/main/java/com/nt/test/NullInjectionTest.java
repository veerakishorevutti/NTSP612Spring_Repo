package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.PersonProfile;

public class NullInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		PersonProfile profile1=null,profile2=null,profile3=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Bean property
		profile1=factory.getBean("rajaProfile",PersonProfile.class);
		System.out.println(profile1);
		System.out.println(".........................................................");
		
		
		profile2=factory.getBean("raniProfile",PersonProfile.class);
		System.out.println(profile2);
		System.out.println(".........................................................");
		
		
		profile3=factory.getBean("sureshProfile",PersonProfile.class);
		System.out.println(profile3);
		System.out.println(".........................................................");
		
	}//main

}//class
