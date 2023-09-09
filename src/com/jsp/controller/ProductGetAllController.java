package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class ProductGetAllController {

public static void main(String[] args) {
		
		Product product = new Product();		
		
		
		ProductService productService = new ProductService();
		productService.getAllProducts(product);
		
	}
	
}
