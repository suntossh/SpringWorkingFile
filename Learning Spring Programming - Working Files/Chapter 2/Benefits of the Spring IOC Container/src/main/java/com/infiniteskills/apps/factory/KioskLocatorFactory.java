package com.infiniteskills.apps.factory;

import com.infiniteskills.spring.di.KioskLocator;
import com.infiniteskills.spring.di.SourceLocator;

public class KioskLocatorFactory {

	public static SourceLocator createInstance() {
		return new KioskLocator("key");
	}
}
