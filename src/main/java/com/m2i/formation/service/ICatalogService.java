package com.m2i.formation.service;

import java.util.List;

import com.m2i.formation.dao.entity.Product;

public interface ICatalogService {

	public void addProduct(Product p);
	public void removeProduct(Product p); 
	public void updateProduct(Product p);
	public Product findProductByRef(String ref);
	public List<Product> findAllProducts();
	
}
