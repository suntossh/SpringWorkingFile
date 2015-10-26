package com.infiniteskills.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanA")
public class BeanA {

	@Value("${properties.propertyA}")
	private String propertyA;

	@Value("${properties.propertyB}")
	private String propertyB;

	@Value("${properties.propertyC}")
	private boolean propertyC;

	public String getPropertyA() {
		return propertyA;
	}

	public void setPropertyA(String propertyA) {
		this.propertyA = propertyA;
	}

	public String getPropertyB() {
		return propertyB;
	}

	public void setPropertyB(String propertyB) {
		this.propertyB = propertyB;
	}

	public boolean isPropertyC() {
		return propertyC;
	}

	public void setPropertyC(boolean propertyC) {
		this.propertyC = propertyC;
	}

}
