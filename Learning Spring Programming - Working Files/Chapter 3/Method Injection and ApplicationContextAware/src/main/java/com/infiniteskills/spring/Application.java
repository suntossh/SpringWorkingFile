package com.infiniteskills.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		Singleton singleton = context.getBean("singleton", Singleton.class);
		Prototype prototype1 = singleton.createPrototype();
		Prototype prototype2 = singleton.createPrototype();
		
		System.out.println((prototype1 == prototype2) ? "Same Instance":"Separate Instances");
	}
}
