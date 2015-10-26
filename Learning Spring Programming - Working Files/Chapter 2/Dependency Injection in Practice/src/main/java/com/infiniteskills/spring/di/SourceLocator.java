package com.infiniteskills.spring.di;

import java.util.List;

public interface SourceLocator {

	public abstract List<RentalLocation> find(String zipcode, int radius);

}