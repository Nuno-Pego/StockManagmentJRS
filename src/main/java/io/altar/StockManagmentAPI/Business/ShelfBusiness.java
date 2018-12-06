package io.altar.StockManagmentAPI.Business;

import java.util.Collection;

import io.altar.StockManagmentAPI.Models.Shelf;
import io.altar.StockManagmentAPI.Repositories.ShelfRepository;

public class ShelfBusiness {

	// Initializing;
	private static final ShelfRepository SHELF_REPOSITORY = ShelfRepository.getInstance();

	// Get next product ID
	public static long getNextID() {
		return SHELF_REPOSITORY.nextID();
	}

	// Get Shelf by ID
	public static Shelf getShelfById(Long id) {
		Shelf searchShelf = SHELF_REPOSITORY.findByID(id);
		return searchShelf;
	}

	// Get all Shelfs
	public static Collection<Shelf> getAllShelfs() {
		return SHELF_REPOSITORY.getAll();
	}	

	// Save Shelf
	public static Shelf saveShelf(Shelf saveShelf) {
		return SHELF_REPOSITORY.save(saveShelf);
	}

	// Update:
	public static void replaceShelf(Shelf shelf) {
		SHELF_REPOSITORY.update(shelf);
	}

	// Remove Shelf
	public static void removeShelf(long id) {
		SHELF_REPOSITORY.removeByID(id);
	}

	// Remove All
	public static void removeAllShelfs() {
		SHELF_REPOSITORY.removeAll();
	}

	// Check if Shelf Repository is empty
	public static boolean isEmpty() {
		return SHELF_REPOSITORY.isEmpty();
	}	

}
