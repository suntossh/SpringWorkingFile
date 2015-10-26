package com.infiniteskills.spring.data.repositories;

import java.util.List;

import com.infiniteskills.spring.data.entities.RentalLocation;

public interface RentalLocationRepository extends Repo<RentalLocation> {

	public String findNameById(Integer id);
	
	public List<RentalLocation> findLocationsByState(String state);
}
