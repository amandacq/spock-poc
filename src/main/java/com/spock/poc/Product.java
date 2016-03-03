package com.spock.poc;

public class Product {

	
	public Product(Long sku, String name, Integer price, Integer stock) {
		super();
		this.sku = sku;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	private Long sku;
	private String name;
	private Integer price;
	private Integer stock;

	public Long getSku() {
		return sku;
	}

	public void setSku(Long sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Product product = (Product) o;

		if (name != null ? !name.equals(product.name) : product.name != null) return false;
		if (price != null ? !price.equals(product.price) : product.price != null) return false;
		if (stock != null ? !stock.equals(product.stock) : product.stock != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (price != null ? price.hashCode() : 0);
		result = 31 * result + (stock != null ? stock.hashCode() : 0);
		return result;
	}
}
