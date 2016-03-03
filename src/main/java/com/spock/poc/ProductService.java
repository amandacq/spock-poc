package com.spock.poc;

/**
 * @author Hans Westerbeek
 */
public interface ProductService {

	/**
	 *
	 * @param id
	 * @return null when the product was not found
	 * @throws ProductNotFoundException 
	 */
	Product findProduct(Long id) throws ProductNotFoundException;

	/**
	 *
	 * @param product
	 * @throws ProductNotFoundException 
	 */
	void addProduct(Product product) throws ProductNotFoundException;

	/**
	 *
	 * @param productId
	 * @param quantity
	 * @return true when the product was sold
	 * @throws OutOfStockException when there is no more stock for this product
	 * @throws ProductNotFoundException 
	 */
	void sell(Long productId, Integer quantity) throws OutOfStockException, ProductNotFoundException;

	void deleteProduct(Product product) throws ProductNotFoundException;
}
