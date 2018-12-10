package io.altar.StockManagmentAPI.Models;
//Class that contain common attributes between Product and Shelf.

import java.io.Serializable;

public class Entity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Attributes:
	private long id;

	// Get and Set:
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
