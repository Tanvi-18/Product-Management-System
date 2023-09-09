package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.configuration.HelperClass;
import com.jsp.dto.Customer;


public class CustomerDao {

	HelperClass helperClass = new HelperClass();
	Connection connection = null;
		
	// to save a customer data
	public Customer saveCustomer(Customer customer) {
		
		connection = helperClass.getConnection();
		
		String sql = "INSERT INTO customer VALUES(?,?,?)";
		
				
			try {
				// create statement
				PreparedStatement preparedstatement = connection.prepareStatement(sql);
				
				//passed the values to delimiters/placeholder ---> ???
				preparedstatement.setInt(1, customer.getId());
				preparedstatement.setString(2, customer.getName());
				preparedstatement.setString(3, customer.getEmail());
				
				//execute
				preparedstatement.execute();
				
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				try {
					connection.close();
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		return customer;
				
	}
	
	
	
	//  to delete a customer data
	public boolean deleteCustomerById(int id) {
		
		connection = helperClass.getConnection();
		
		String sql = "DELETE FROM customer WHERE ID=?";
		
		int i=0;
		
		
			try {
				
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				
				preparedStatement.setInt(1, id);
				
				  i = preparedStatement.executeUpdate();
				
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				try {
					connection.close();
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
		if(id>0) {
			return true;
		}
		else {
			return false;
		}	
		
	}
	
	
	
	// to update a customer data
	public Customer updateCustomerById(Customer customer) {
		
		connection = helperClass.getConnection();
		
		String sql = "UPDATE customer SET name=? , email=? WHERE ID =?";
		
		
		
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
								
				preparedStatement.setString(1, customer.getName());
				preparedStatement.setString(2, customer.getEmail());
				preparedStatement.setInt(3, customer.getId());
	
							
				int i =preparedStatement.executeUpdate();
				
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				
					try {
						connection.close();
					} 
					catch (SQLException e) {
						e.printStackTrace();
					}
			}
		return customer;
		
	}
	
	
	// to get data of a customer
	public Customer getCustomerById(Customer customer) {
		
		connection = helperClass.getConnection();

		String sql = "SELECT * FROM customer WHERE ID = ?";
		
	
			try {
				
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				
				preparedStatement.setInt(1,  customer.getId());
				
				ResultSet resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					System.out.print(resultSet.getInt(1)+" "+"| ");
					System.out.print(resultSet.getString(2)+" "+"| ");
					System.out.println(resultSet.getString(3)+" "+"| ");
					System.out.println("===========================");
				}		
				
				
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				try {
					connection.close();
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return customer;
			
	}
	
	
	// to get all the records from the customer table
	public Customer getAllCustomers(Customer customer) {
		
		connection = helperClass.getConnection();

		String sql = "SELECT * FROM customer";
		
	
			try {
				
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				
						
				ResultSet resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					System.out.print(resultSet.getInt(1)+" "+"| ");
					System.out.print(resultSet.getString(2)+" "+"| ");
					System.out.println(resultSet.getString(3)+" "+"| ");
					System.out.println("===========================");
				}		
				
				
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				try {
					connection.close();
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return customer;
			
	}
	
	
}
