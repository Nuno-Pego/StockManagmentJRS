package io.altar.StockManagmentAPI.Models;

import java.util.ArrayList;

//Imports:

import java.util.List;

//Class Model Product
public class Product extends Entity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Fields:
	private List<Shelf> listShelfs;
	private int discountPrice;
	private int iva;
	private double pvp;

	// Constructor:
	
	public Product() {}
	
	public Product(int discountPrice, int iva, double pvp) {
		this.listShelfs = new ArrayList<Shelf>();
		this.discountPrice = discountPrice;
		this.iva = iva;
		this.pvp = pvp;
	}
	
	public Product(List<Shelf> listShelfs, int discountPrice, int iva, double pvp) {
		this.listShelfs = listShelfs;
		this.discountPrice = discountPrice;
		this.iva = iva;
		this.pvp = pvp;
	}

	// Getters and Setters:
	public List<Shelf> getListShelfs() {
		return listShelfs;
	}

	public void setListShelfs(List<Shelf> listShelfs) {
		this.listShelfs = listShelfs;
	}
	//-------------------------------------------------------
	public int getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}
	//-------------------------------------------------------
	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}
	//-------------------------------------------------------
	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}
	//-------------------------------------------------------
}