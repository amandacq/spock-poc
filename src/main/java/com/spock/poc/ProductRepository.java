package com.spock.poc;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

	List<Product> productList = new ArrayList<Product>(); 
	public void addProduct(Product product) {
		productList.add(product);
	}

	public Product findByName(String name) throws ProductNotFoundException {
		for (Product product : productList) {
			if (product.getName().equals(name)) {
				return product;
			}
		}
		throw new ProductNotFoundException();
	}

	public Product getProduct(Long sku) throws ProductNotFoundException {
		for (Product product : productList) {
			if (product.getSku().equals(sku)) {
				return product;
			}
		}
		throw new ProductNotFoundException();
	}

	public List<Product> findAll() throws ProductNotFoundException {
		if (productList.isEmpty()) {
			throw new ProductNotFoundException();
		}
		return productList;
	}

	public void deleteProduct(Product product) throws ProductNotFoundException {
		if (!productList.remove(product)) {
			throw new ProductNotFoundException();
		}
		
	}
}
