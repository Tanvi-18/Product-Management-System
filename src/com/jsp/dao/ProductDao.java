package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.configuration.HelperClass;
import com.jsp.dto.Product;


public class ProductDao {
	
	HelperClass helperClass = new HelperClass();
	
	Connection connection = null;
	
	
	public Product saveProduct(Product product) {
		
		connection = helperClass.getConnection();
		
		String sql = "INSERT INTO product VALUES(?,?,?,?)";
		
			try {
				PreparedStatement preparedstatement = connection.prepareStatement(sql);
				
				preparedstatement.setInt(1, product.getId());
				preparedstatement.setString(2, product.getName());
				preparedstatement.setString(3, product.getBrand());
				preparedstatement.setDouble(4, product.getPrice());
	
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
		return product;
			
	}
	
	
	public boolean deleteProductById(int id) {
		
		connection = helperClass.getConnection();
		
		String sql = "DELETE FROM product WHERE ID=?";
		
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
	
	public Product updateProductById(Product product) {
		
		connection = helperClass.getConnection();
		
		String sql = "UPDATE product SET name=? , brand=?, price=? WHERE ID =?";
		
			try {
				PreparedStatement preparedstatement = connection.prepareStatement(sql);
				
				preparedstatement.setString(1, product.getName());
				preparedstatement.setString(2, product.getBrand());
				preparedstatement.setDouble(3, product.getPrice());
				preparedstatement.setInt(4, product.getId());
	
				int i= preparedstatement.executeUpdate();
							
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
		return product;
			
	}
	
	public Product getProductById(Product product) {
		
		connection = helperClass.getConnection();

		String sql = "SELECT * FROM product WHERE ID = ?";
		
	
			try {
				
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				
				preparedStatement.setInt(1,  product.getId());
				
				ResultSet resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					System.out.print(resultSet.getInt(1)+" "+"| ");
					System.out.print(resultSet.getString(2)+" "+"| ");
					System.out.print(resultSet.getString(3)+" "+"| ");
					System.out.println(resultSet.getDouble(4)+" "+"| ");
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
			return product;
			
	}
	
	public Product getAllProducts(Product product) {
		
		connection = helperClass.getConnection();

		String sql = "SELECT * FROM product";
		
	
			try {
				
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				
						
				ResultSet resultSet = preparedStatement.executeQuery();
				
				while(resultSet.next()) {
					System.out.print(resultSet.getInt(1)+" "+"| ");
					System.out.print(resultSet.getString(2)+" "+"| ");
					System.out.print(resultSet.getString(3)+" "+"| ");
					System.out.println(resultSet.getDouble(4)+" "+"| ");
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
			return product;
			
	}
		

}
