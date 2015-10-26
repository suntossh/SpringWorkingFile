package com.infiniteskills.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Bean bean = context.getBean("bean", Bean.class);
		
		System.out.println("\nPrinting List:");
		for(ObjectA token: bean.getList()) {
			System.out.println(token);
		}

		System.out.println("\nPrinting Set:");
		for(String token: bean.getSet()) {
			System.out.println(token);
		}
		
		System.out.println("\nPrinting Map:");
		for(String token: bean.getMap().values()) {
			System.out.println(token);
		}

		System.out.println("\nPrinting Properties:");
		for(Object key: bean.getProperties().keySet()) {
			System.out.println(bean.getProperties().getProperty((String) key));
		}
	}
}
