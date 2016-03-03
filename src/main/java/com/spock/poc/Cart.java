package com.spock.poc;

import java.util.ArrayList;
import java.util.List;

public class Cart {	
	private List<CartItem> items = new ArrayList<CartItem>();
	
	public void addProduct(Product product, int quantity, boolean isGift) throws OutOfStockException {
		validateStock(product, quantity);
		CartItem cartItem = getProductItem(product);
		cartItem.setGift(isGift);
		cartItem.plusQuantity(quantity);		
	}

	private void validateStock(Product product, int quantity)
			throws OutOfStockException {
		int stockAvailable = product.getStock() - quantity;
		if(stockAvailable <= 0) {
			int stockLeft = stockAvailable * -1;
			throw new OutOfStockException(stockLeft);
		}
	}
	
	private CartItem getProductItem(Product product) {
		for (CartItem cartItem : items) {
			if (cartItem.getProduct().equals(product)) {
				return cartItem;
			}
 		}
		CartItem cartItem = new CartItem(product, 0, false);
		items.add(cartItem);
		return cartItem;
	}
	
	public List<CartItem> getItems() {
		return items;
	}

}
