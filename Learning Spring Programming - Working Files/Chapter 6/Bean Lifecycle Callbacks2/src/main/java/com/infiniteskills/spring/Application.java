package com.infiniteskills.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	@SuppressWarnings({ "unused" })
	public static void main(String[] args) {
		//ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/application-context.xml");
		BeanA beanA = context.getBean("beanA", BeanA.class);
		context.close();
	}
}
