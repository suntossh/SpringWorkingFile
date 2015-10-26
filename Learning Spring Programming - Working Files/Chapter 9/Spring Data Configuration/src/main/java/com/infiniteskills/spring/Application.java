package com.infiniteskills.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infiniteskills.spring.data.repositories.RentalLocationRepository;

public class Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		RentalLocationRepository repo = context.getBean(RentalLocationRepository.class);
		
		System.out.println(repo.findOne(8).getName());
	}
	
}