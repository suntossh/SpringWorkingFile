package com.infiniteskills.spring;

import java.util.Calendar;

public class BeanA {

	private Calendar calendar;
	
	public BeanA(Calendar calendar) {
		this.calendar = calendar;
	}
	
	public int getYear() {
		return this.calendar.get(Calendar.YEAR);
	}
}
