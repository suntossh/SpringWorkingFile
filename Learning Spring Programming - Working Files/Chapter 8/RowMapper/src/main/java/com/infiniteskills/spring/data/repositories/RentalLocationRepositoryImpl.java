package com.infiniteskills.spring.data.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.infiniteskills.spring.data.entities.RentalLocation;

@Repository
public class RentalLocationRepositoryImpl implements RentalLocationRepository {

	private JdbcTemplate template;

	private static final String COLUMNS = "rental_location_id, name, address1, address2, city, state, postal_code";

	private static final String SIMPLE_QUERY = "select name from rental_location where rental_location_id = ?";

	private static final String FIND_BY_ID_QUERY = 
			"select " + COLUMNS + " from rental_location where rental_location_id= ?";

	private static final String FIND_BY_STATE_QUERY =
			"select " + COLUMNS + " from rental_location where state = ?";

	@Autowired
	public RentalLocationRepositoryImpl(DataSource dataSource) {
		this.template = new JdbcTemplate(dataSource);
	}
	
	public List<RentalLocation> findLocationsByState(String state){
		return this.template.query(FIND_BY_STATE_QUERY, new Object[] {state},new RentalLocationRowMapper());
	}
	
	private static class RentalLocationRowMapper implements RowMapper<RentalLocation>{

		public RentalLocation mapRow(ResultSet rs, int rowNum) throws SQLException {
			RentalLocation location = new RentalLocation();
			location.setRentalLocationId(rs.getInt("rental_location_id"));
			location.setName(rs.getString("name"));
			location.setAddress1(rs.getString("address1"));
			location.setAddress2(rs.getString("address2"));
			location.setCity(rs.getString("city"));
			location.setPostalCode(rs.getString("postal_code"));
			return location;
		}
		
	}
	
	public RentalLocation findById(Integer id) {
		return this.template.queryForObject(FIND_BY_ID_QUERY, new Object[] {id}, new RentalLocationRowMapper() );
	}
	
	public String findNameById(Integer id) {
		return this.template.queryForObject(SIMPLE_QUERY, new Object[] { id }, String.class);
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

}
