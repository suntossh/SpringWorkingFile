package com.infiniteskills.spring.data.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.infiniteskills.spring.data.entities.Media;
import com.infiniteskills.spring.data.entities.RentalLocation;

public class RentalLocationResultExtractor implements ResultSetExtractor<List<RentalLocation>> {

	public List<RentalLocation> extractData(ResultSet rs) throws SQLException, DataAccessException {
		Map<Integer,RentalLocation> locations = new HashMap<Integer,RentalLocation>();
		RentalLocation location;
		
		while(rs.next()) {
			Integer id  = rs.getInt("rental_location_id");
			location = locations.get(id);
			
			if(location == null) {
				location = new RentalLocation();
				location.setRentalLocationId(rs.getInt("rental_location_id"));
				location.setName(rs.getString("name"));
				location.setAddress1(rs.getString("address1"));
				location.setAddress2(rs.getString("address2"));
				location.setCity(rs.getString("city"));
				location.setPostalCode(rs.getString("postal_code"));
			}
			
			Integer mediaId = rs.getInt("media_id");
			
			if(mediaId > 0) {
				Media media = new Media();
				media.setMediaId(rs.getInt("media_id"));
				media.setTitle(rs.getString("title"));
				media.setLength(rs.getInt("length"));
				media.setRating(rs.getInt("rating"));
				media.setFormat(rs.getString("format"));
				media.setIsAvailable(rs.getBoolean("is_available"));
				media.setRentalLocation(location);
				location.getMedia().add(media);
			}
			locations.put(id, location);
			
		}
		return new ArrayList<RentalLocation> (locations.values());
	}

}
