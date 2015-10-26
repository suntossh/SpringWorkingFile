package com.infiniteskills.apps.manual;

import com.infiniteskills.spring.di.KioskLocator;
import com.infiniteskills.spring.di.RentalService;

public class CustomerWebsite {

	public static void main(String[] args) {

		RentalService rentalService = new RentalService(new KioskLocator());
		
		rentalService.find("Speed", "16802", 10);

		//Allow website users to find titles
	}
}
