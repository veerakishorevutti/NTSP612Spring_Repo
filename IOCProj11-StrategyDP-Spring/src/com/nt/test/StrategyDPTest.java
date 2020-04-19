package com.nt.test;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Vehicle;

public class StrategyDPTest {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		Vehicle vehicle=null;
		//Locate and hold spring bean cfg file
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Target Bean calss object
		vehicle=factory.getBean("vehicle",Vehicle.class);
		// invoke the b.method
		vehicle.journey("hyd","delhi");
		
		
		

	}

}
