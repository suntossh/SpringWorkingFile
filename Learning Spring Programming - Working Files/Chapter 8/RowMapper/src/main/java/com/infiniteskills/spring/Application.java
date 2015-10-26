package com.infiniteskills.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infiniteskills.spring.data.entities.RentalLocation;
import com.infiniteskills.spring.data.repositories.RentalLocationRepository;

public class Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		RentalLocationRepository repo = context.getBean(RentalLocationRepository.class);
		
		List<RentalLocation> locations = repo.findLocationsByState("TX");
		
		for(RentalLocation location: locations) {
			System.out.println(location.getName());
		}
		
		/*
		RentalLocation location = repo.findById(7);
		
		System.out.println(location.getName());
		System.out.println(location.getRentalLocationId());*/
	}
}