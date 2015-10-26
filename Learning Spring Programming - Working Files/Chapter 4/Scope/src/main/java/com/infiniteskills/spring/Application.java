package com.infiniteskills.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		BeanA beanA = context.getBean("beanA", BeanA.class);
		BeanA beanA2 = context.getBean("beanA", BeanA.class);

		BeanB beanB = context.getBean("beanB", BeanB.class);
		BeanB beanB2 = context.getBean("beanB", BeanB.class);
		
		System.out.println(beanA == beanA2 ? "Same Instance":"Different Instances");
		System.out.println(beanB == beanB2 ? "Same Instance":"Different Instances");
		
	}
}
