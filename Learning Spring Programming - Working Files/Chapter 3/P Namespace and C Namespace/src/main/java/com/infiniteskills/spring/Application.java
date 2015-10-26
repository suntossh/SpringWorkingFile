package com.infiniteskills.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		BeanA beanA = context.getBean(BeanA.class);
		System.out.println(beanA.getProp1());
		beanA.getBeanB().execute();
	}
}
