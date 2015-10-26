package com.infiniteskills.apps.manual;

import java.util.List;

import com.infiniteskills.spring.di.KioskLocator;
import com.infiniteskills.spring.di.RentalLocation;
import com.infiniteskills.spring.di.RentalService;

public class AdminConsole {


	@SuppressWarnings("unused")
	public static void main(String[] args) {

		
		RentalService rentalService = new RentalService(new KioskLocator("key"));

		List<RentalLocation> locations = rentalService.find("Speed", "16802", 10);
		
		//Allow admins to support customers
		
	}
}
