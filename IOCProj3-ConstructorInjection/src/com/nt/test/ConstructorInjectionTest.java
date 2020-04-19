package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		WishMessageGenerator generator=null;
		//hold spring bean cfg name and location
		res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		//res=new ClassPathResource("applicationContext.xml");
		//create IOC container
		factory=new XmlBeanFactory(res);
		//get Target Bean class object
		generator=(WishMessageGenerator) factory.getBean("wmg");
		//invoke b.method
		System.out.println("Result==="+generator.generateWishMessage("raja"));
		
	}

}
