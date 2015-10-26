package com.infiniteskills.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		ApplicationContext context = new ClassPathXmlApplicationContext("config/application-context.xml");
		BeanA beanA = context.getBean("beanA", BeanA.class);
		 
		 System.out.println("PropertyA: " + beanA.getPropertyA());
		 System.out.println("PropertyB: " + beanA.getPropertyB());
		 System.out.println("PropertyC: " + beanA.isPropertyC());

	}
}
