package com.jsp.controller;

import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;

public class CustomerSaveController {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setId(6);
		customer.setName("MANSI");
		customer.setEmail("mansi@mail.com");
		
		CustomerService customerService = new CustomerService();
		Customer c = customerService.saveCustomer(customer);
		
		if(c!=null) {
			System.out.println(c.getId() + " Saved Successfully");
		}
		
	}
	
}
