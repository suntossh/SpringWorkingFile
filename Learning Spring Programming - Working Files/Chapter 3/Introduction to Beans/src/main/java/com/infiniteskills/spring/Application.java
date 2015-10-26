package com.infiniteskills.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		BeanA bean1 = context.getBean("bean1", BeanA.class);
		BeanA bean2 = context.getBean("_beanA", BeanA.class);
		
		System.out.println(bean1 == bean2);
	}

}
