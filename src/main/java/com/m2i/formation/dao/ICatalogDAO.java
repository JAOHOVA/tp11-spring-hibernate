package com.m2i.formation.dao;

import java.util.List;

import com.m2i.formation.dao.entity.Product;

public interface ICatalogDAO {

	public void addProduct(Product p);
	public void removeProduct(Product p); 
	public void updateProduct(Product p);
	public Product findProductByRef(String ref);
	public List<Product> findAllProducts();
	
}
