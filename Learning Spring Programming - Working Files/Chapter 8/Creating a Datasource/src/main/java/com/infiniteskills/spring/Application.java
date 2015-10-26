package com.infiniteskills.spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		DataSource dataSource = context.getBean("datasource", DataSource.class);
		
		Connection connection = null;
		PreparedStatement statement = null;

		try {
			connection = dataSource.getConnection();
			//connection = DriverManager.getConnection(
			//		"jdbc:mysql://localhost:3306/practice", "spring", "spring");

			String sql = "insert into rental_location(name, address1, address2, city, state, postal_code) "
					+ "values(?,?,?,?,?,?)";
			
			statement = connection.prepareStatement(sql);

			statement.setString(1, "Gas Station");
			statement.setString(2, "Address1");
			statement.setString(3, "Address2");
			statement.setString(4, "City");
			statement.setString(5, "State");
			statement.setString(6, "PostalCode");
			
			statement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// no idea
				e.printStackTrace();
			}
		}
	}
}
