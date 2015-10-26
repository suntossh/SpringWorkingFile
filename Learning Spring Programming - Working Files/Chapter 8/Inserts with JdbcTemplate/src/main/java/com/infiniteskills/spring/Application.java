package com.infiniteskills.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infiniteskills.spring.data.entities.RentalLocation;
import com.infiniteskills.spring.data.repositories.RentalLocationRepository;

public class Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		RentalLocationRepository repo = context.getBean(RentalLocationRepository.class);
		
		RentalLocation location = getLocation();
		
		repo.insert(location);
		System.out.println(location.getRentalLocationId());
	}
	
	public static RentalLocation getLocation() {
		RentalLocation location = new RentalLocation();
		location.setName("Diner");
		location.setAddress1("33 Silver Diner Lane");
		location.setAddress2("Suite 3");
		location.setCity("Salt Lake City");
		location.setState("UT");
		location.setPostalCode("172030");
		return location;
	}
}