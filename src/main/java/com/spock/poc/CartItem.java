package com.spock.poc;

public class CartItem {
	
	private Product product;
	private int quantity;
	private boolean isGift;
	
	public CartItem(Product product, int quantity, boolean isGift) {
		super();
		this.setProduct(product);
		this.setQuantity(quantity);
		this.setGift(isGift);
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product item) {
		this.product = item;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void plusQuantity(int quantity) {
		this.quantity = this.quantity + quantity;
	}

	public boolean isGift() {
		return isGift;
	}

	public void setGift(boolean isGift) {
		this.isGift = isGift;
	}
	
	
	

}
