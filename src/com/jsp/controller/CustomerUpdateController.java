package com.jsp.controller;

import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;

public class CustomerUpdateController {
	
	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setId(4);
		customer.setName("MANISH");
		customer.setEmail("manish@mail.com");
		
		
		CustomerService customerService = new CustomerService();
		Customer c = customerService.updateCustomerById(customer);
		
		if(c!=null) {
			System.out.println(c.getId() + " Updated Successfully");
		}
		
	}

}
