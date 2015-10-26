package com.infiniteskills.apps.manual;

import com.infiniteskills.spring.di.KioskLocator;
import com.infiniteskills.spring.di.RentalService;

public class MobileApp {

	
	public static void main(String[] args) {
		
		RentalService rentalService = new RentalService(new KioskLocator());
		rentalService.find("Speed", "55555", 4);
		
		//Allow mobile users to find titles
	}
}
