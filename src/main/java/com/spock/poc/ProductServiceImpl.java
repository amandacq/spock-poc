package com.spock.poc;


class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;

	ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Product findProduct(Long id) throws ProductNotFoundException {
		return productRepository.getProduct(id);
	}

	@Override
	public void addProduct(Product product) throws ProductNotFoundException {

		// see if it already exists
		if (productRepository.findByName(product.getName()) == null){
			productRepository.addProduct(product);
		}

	}

	@Override
	public void sell(Long productId, Integer quantity) throws OutOfStockException, ProductNotFoundException{
		// completely un-threadsafe :)
		Product product = findProduct(productId);
		if (product == null)
			throw new IllegalArgumentException("You can't sell a product that does not exist");

		if (product.getStock() < quantity){
			throw new OutOfStockException(product.getStock());
		}

		product.setStock(product.getStock() - quantity);
	}

	@Override
	public void deleteProduct(Product product) throws ProductNotFoundException {
		productRepository.deleteProduct(product);
	}


}

