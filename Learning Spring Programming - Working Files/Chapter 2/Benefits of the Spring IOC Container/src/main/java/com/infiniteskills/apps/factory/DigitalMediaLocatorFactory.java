package com.infiniteskills.apps.factory;

import com.infiniteskills.spring.di.DigitalMediaLocator;
import com.infiniteskills.spring.di.SourceLocator;

public class DigitalMediaLocatorFactory {

	public static SourceLocator createInstance() {
		return new DigitalMediaLocator();
	}
}
