package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class ProductUpdateController {
	
	public static void main(String[] args) {
		
		Product product = new Product();
		product.setId(4);
		product.setName("Shoes");
		product.setBrand("NIKE");
		product.setPrice(6400);
		
		ProductService productService = new ProductService();
		Product p = productService.updateProductById(product);
		
		if(p!=null) {
			System.out.println(p.getId() + " Saved Successfully");
		}
		
	}

}
