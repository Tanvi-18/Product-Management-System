package com.jsp.controller;

import com.jsp.service.ProductService;

public class ProductDeleteController {

public static void main(String[] args) {
	
		ProductService productService = new ProductService();
		
		boolean res = productService.deleteProductById(6);
		System.out.println(res);
		
	}
	
}
