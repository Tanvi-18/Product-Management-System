package com.jsp.controller;

import com.jsp.service.CustomerService;

public class CustomerDeleteController {
	
	public static void main(String[] args) {
		
		CustomerService customerService = new CustomerService();
		
		boolean res = customerService.deleteCustomerById(6);
		System.out.println(res);
		
	}

}
