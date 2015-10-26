package com.infiniteskills.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringApplication {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"application-context.xml");
		JdbcTemplate template = context.getBean("template", JdbcTemplate.class);

		template.update(
				"insert into rental_location value(?,?,?,?,?,?,?)",
				2, "Grocery Store", "3306 Trisle Pike", null,
				"Pivotal Springs", "WA", "15550-433");

	}
}
