package com.infiniteskills.apps.manual;

import com.infiniteskills.spring.di.KioskLocator;
import com.infiniteskills.spring.di.RentalService;

public class NightlyInventory {


	@SuppressWarnings("unused")
	public static void main(String[] args) {
			
		RentalService rentalService = new RentalService(new KioskLocator());
		
		//Find inventory each night.
	}
}
