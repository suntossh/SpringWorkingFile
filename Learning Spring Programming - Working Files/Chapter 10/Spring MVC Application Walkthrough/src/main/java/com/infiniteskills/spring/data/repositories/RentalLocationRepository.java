package com.infiniteskills.spring.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infiniteskills.spring.data.entities.RentalLocation;

@Repository
public interface RentalLocationRepository extends JpaRepository<RentalLocation, Integer> {

}
