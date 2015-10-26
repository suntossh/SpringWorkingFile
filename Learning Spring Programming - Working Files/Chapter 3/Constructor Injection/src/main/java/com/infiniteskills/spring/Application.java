package com.infiniteskills.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		BeanA simple = context.getBean("simpleExample", BeanA.class);
		BeanA type = context.getBean("typeExample", BeanA.class);
		BeanA ref = context.getBean("refExample", BeanA.class);
		BeanA inner = context.getBean("innerBeanExample", BeanA.class);
		BeanA multipleArgs = context.getBean("twoArgumentIndexExample", BeanA.class);
	}
}
