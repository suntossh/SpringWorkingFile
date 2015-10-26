package com.infiniteskills.spring.data.repositories;

import com.infiniteskills.spring.data.entities.RentalLocation;

public interface RentalLocationRepository extends Repo<RentalLocation> {

	public String findNameById(Integer id);
}
