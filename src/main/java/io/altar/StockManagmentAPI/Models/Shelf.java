package io.altar.StockManagmentAPI.Models;

import io.altar.StockManagmentAPI.Business.ProductBusiness;

//Class Model Shelf
public class Shelf extends Entity {

	// Fields:
	private int capacity;
	private Product product;
	private double price;

	// Constructor:
	public Shelf() {}
	
	public Shelf(int capacity, double price) {
		this.capacity = capacity;
		this.price = price;
	}

	public Shelf(long id, int capacity, double price) {
		this.product = ProductBusiness.getProductById(id);
		this.capacity = capacity;
		this.price = price;
	}

	// Getters and Setters
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	// -------------------------------------------------------
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setProductAndSetShelf(Product product) {
		this.product = product;
		this.product.addToListShelfs(this.getId());
	}

	// -------------------------------------------------------
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}