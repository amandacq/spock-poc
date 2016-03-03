package com.spock.poc;

public class OutOfStockException extends Exception {

	private int availableStock;

	public OutOfStockException(int availableStock) {
		this.availableStock = availableStock;
	}
}
