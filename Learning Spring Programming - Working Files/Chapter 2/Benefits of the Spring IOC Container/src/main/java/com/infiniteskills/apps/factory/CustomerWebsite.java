package com.infiniteskills.apps.factory;

import java.util.List;

import com.infiniteskills.spring.di.RentalLocation;
import com.infiniteskills.spring.di.RentalService;

public class CustomerWebsite {

	@SuppressWarnings("unused")
	public static void main(String[] args) {


		RentalService rentalService = new RentalService(DigitalMediaLocatorFactory.createInstance());
		
		List<RentalLocation> locations = rentalService.find("The Grey", "16802", 10);
		
		//Allow website users to find titles
	}
}
