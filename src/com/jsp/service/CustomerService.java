package com.jsp.service;

import com.jsp.dao.CustomerDao;
import com.jsp.dto.Customer;

public class CustomerService {
	
	CustomerDao customerDao = new CustomerDao();
	
		public Customer saveCustomer(Customer customer) {
			return customerDao.saveCustomer(customer);
		}
		
		public boolean deleteCustomerById(int id) {
			return customerDao.deleteCustomerById(id);
		}
		
		public Customer updateCustomerById(Customer customer) {
			return customerDao.updateCustomerById(customer);
		}
	
		public Customer getCustomerById(Customer customer) {
			return customerDao.getCustomerById(customer);
		}
	
		
		public Customer getAllCustomers(Customer customer) {
			return customerDao.getAllCustomers(customer);
		}

	
}	
