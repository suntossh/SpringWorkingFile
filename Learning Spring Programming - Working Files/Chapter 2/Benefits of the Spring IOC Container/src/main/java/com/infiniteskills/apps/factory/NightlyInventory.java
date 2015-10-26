package com.infiniteskills.apps.factory;

import java.util.List;

import com.infiniteskills.spring.di.RentalLocation;
import com.infiniteskills.spring.di.RentalService;

public class NightlyInventory {

	private static final String TITLE = "Forest Gump";

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		RentalService rentalService = new RentalService(KioskLocatorFactory.createInstance());
		
		List<RentalLocation> locations = rentalService.find(TITLE, "16802", 10);

		//Find inventory each night.
	}
}
