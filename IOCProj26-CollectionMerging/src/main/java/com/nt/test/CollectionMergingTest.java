package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.EnggCourse;

public class CollectionMergingTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		EnggCourse course1=null,course2=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Bean clas objects
		course1=factory.getBean("ecfyEngg",EnggCourse.class);
		System.out.println(course1);
		System.out.println(".............................................................");
		
		course2=factory.getBean("csfyEngg",EnggCourse.class);
		System.out.println(course2);
		System.out.println(".............................................................");
		
	}

}
