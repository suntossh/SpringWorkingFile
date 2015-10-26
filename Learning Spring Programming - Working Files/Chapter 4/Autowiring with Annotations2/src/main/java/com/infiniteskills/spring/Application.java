package com.infiniteskills.spring;

import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");
		BeanA beanA = context.getBean("beanA", BeanA.class);
		
		for(Entry<String,BeanB> entry: beanA.getBeanBs().entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
