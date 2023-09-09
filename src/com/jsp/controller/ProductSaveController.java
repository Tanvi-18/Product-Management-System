package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class ProductSaveController {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setId(6);
		product.setName("Smart Watch");
		product.setBrand("BOAT");
		product.setPrice(2000);
		
		ProductService productService = new ProductService();
		Product p = productService.saveProduct(product);
		
		if(p!=null) {
			System.out.println(p.getId() + " Saved Successfully");
		}
		
	}
	
}
