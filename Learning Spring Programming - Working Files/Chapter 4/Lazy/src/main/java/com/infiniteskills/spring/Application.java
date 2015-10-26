package com.infiniteskills.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Thread.sleep(3000);
		BeanA beanA = context.getBean("beanA", BeanA.class);
		
		System.out.println(beanA.getBean().getBeanName());
	}
}
