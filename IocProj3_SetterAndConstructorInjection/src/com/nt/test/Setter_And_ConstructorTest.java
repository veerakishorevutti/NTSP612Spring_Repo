package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class Setter_And_ConstructorTest {

	public static void main(String[] args) {
		Resource  res=null;
		BeanFactory factory=null;
		WishMessageGenerator wish=null;
		//Holding Spring Bean Configuration File
		res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//Creating beanfactory Object
		factory=new XmlBeanFactory(res);
		//Getting Object
		wish=(WishMessageGenerator) factory.getBean("wmg");
		System.out.println("Result is::"+wish.GenerateWishMessage("Chinmaya"));
		

	}

}
