package com.jsp.controller;

import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;

public class CustomerGetAllController {

public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		
		CustomerService customerService = new CustomerService();
		customerService.getAllCustomers(customer);		
				
	}
	
}
