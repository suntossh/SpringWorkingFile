package com.infiniteskills.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Prototype proto = context.getBean("prototype", Prototype.class);
		Prototype proto2 = context.getBean("prototype", Prototype.class);
		
		System.out.println(proto == proto2);
	}
}
