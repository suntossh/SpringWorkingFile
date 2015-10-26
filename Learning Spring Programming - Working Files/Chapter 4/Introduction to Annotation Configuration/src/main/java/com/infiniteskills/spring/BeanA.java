package com.infiniteskills.spring;

import org.springframework.beans.factory.annotation.Value;


public class BeanA {

	@Value("Test1")
	private String myProperty;

	public String getMyProperty() {
		return myProperty;
	}
	
	public void setMyProperty( String myProperty) {
		this.myProperty = myProperty;
	}

}
