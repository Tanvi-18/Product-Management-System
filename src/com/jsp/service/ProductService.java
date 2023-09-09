package com.jsp.service;

import com.jsp.dao.ProductDao;
import com.jsp.dto.Product;

public class ProductService {
	
	ProductDao productDao = new ProductDao();
	
		public Product saveProduct(Product product) {
			return productDao.saveProduct(product);			
		}
	
		public boolean deleteProductById(int id) {
			return productDao.deleteProductById(id);
		}
	
		public Product updateProductById(Product product) {
			return productDao.updateProductById(product);
		}
		
		public Product getProductById(Product product) {
			return productDao.getProductById(product);
		}
		
		public Product getAllProducts(Product product) {
			return productDao.getAllProducts(product);
		}




}
