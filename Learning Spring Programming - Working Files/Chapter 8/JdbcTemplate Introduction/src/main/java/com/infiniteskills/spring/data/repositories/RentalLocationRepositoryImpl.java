package com.infiniteskills.spring.data.repositories;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.infiniteskills.spring.data.entities.RentalLocation;

@Repository
public class RentalLocationRepositoryImpl implements RentalLocationRepository {
	
	private JdbcTemplate template;
	
	private static final String SIMPLE_QUERY = "select name from rental_location where rental_location_id = ?";
	
	public String findNameById(Integer id) {
		
		return this.template.queryForObject(SIMPLE_QUERY, new Object[] {id}, String.class);
	}
	
	@Autowired
	public RentalLocationRepositoryImpl(DataSource dataSource) {
		this.template = new JdbcTemplate(dataSource);
	}
	
	public void insert(RentalLocation entity) {
		// TODO Auto-generated method stub
		
	}

	public void update(RentalLocation entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(RentalLocation entity) {
		// TODO Auto-generated method stub
		
	}

	public RentalLocation findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
