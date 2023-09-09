package com.jsp.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelperClass {
	
	String url = "jdbc:mysql://localhost:3306/product_jdbc";
	String username = "root";
	String password = "root";
	
	// to establish Connection
	Connection connection = null;
	
	public Connection getConnection() {
		
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				connection = DriverManager.getConnection(url, username, password);
			
			} 
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
		
		return connection;
				
	}

}
