package com.infiniteskills.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("classpath:config/application-context.xml");
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"C:\\Users\\Kevin Bowersox\\Desktop\\Development\\Workspaces\\STS Workspace 3.5\\spring-bean-demo\\src\\main\\resources\\config\\application-context.xml");
		MyResourceReader reader = context.getBean("myResourceReader",
				MyResourceReader.class);
		reader.print();

	}
}
