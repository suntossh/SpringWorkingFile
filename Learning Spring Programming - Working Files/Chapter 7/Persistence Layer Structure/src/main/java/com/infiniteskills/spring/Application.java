package com.infiniteskills.spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Application {

	public static void main(String[] args) {
		
		Connection connection = null;
		PreparedStatement statement = null;
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "spring", "spring");
			
			String sql = "insert into rental_location values(?,?,?,?,?,?,?)";
			statement = connection.prepareStatement(sql);
			
			statement.setInt(1, 1);
			statement.setString(2, "Gas Station");
			statement.setString(3, "Address1");
			statement.setString(4, "Address2");
			statement.setString(5, "City");
			statement.setString(6, "State");
			statement.setString(7, "PostalCode");
			
			statement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				//no idea
				e.printStackTrace();
			}
		}
	}
}
