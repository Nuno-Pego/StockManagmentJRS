package io.altar.StockManagmentAPI.Business;

import java.util.Collection;

import io.altar.StockManagmentAPI.Models.Shelf;
import io.altar.StockManagmentAPI.Repositories.ShelfRepository;

public class ShelfService {

	// Initializing;
	private static final ShelfRepository SHELF_REPOSITORY = ShelfRepository.getInstance();

	// Create Shelf
	public static void createShelf(int capacity, float price) {
		Shelf newShelf = new Shelf(capacity, price);
		SHELF_REPOSITORY.save(newShelf);
	}

	public static void createShelf(Long productIDs, int capacity, float price) {
		Shelf newShelf = new Shelf(productIDs, capacity, price);
		SHELF_REPOSITORY.save(newShelf);
	}

	// Add Product to Shelf
	public static void addProductToShelf(Shelf shelf, long idProduct) {
		shelf.setProduct(ProductService.getProductById(idProduct));
		SHELF_REPOSITORY.updateByID(shelf);
	}

	// Get size of Data
	public static int getSizeOfData() {
		return SHELF_REPOSITORY.lenghtData();
	}

	// Get actual product ID
	public static long getActualID() {
		return SHELF_REPOSITORY.getActualID();
	}

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

	// Get all Shelfs ID's
	public static Collection<Long> getAllShelfsIDs() {
		return SHELF_REPOSITORY.getAllIDs();
	}

	// Edit Shelf
	public static void editShelf(Shelf editShelf) {
		SHELF_REPOSITORY.save(editShelf);
	}

	// Remove Shelf
	public static void removeShelf(long id) {
		SHELF_REPOSITORY.removeByID(id);
	}

	// Check if Shelf Repository is empty
	public static boolean isEmpty() {
		return SHELF_REPOSITORY.isEmpty();
	}

	// Get all Shelfs ID's without products
	public static Collection<Long> getAllShelfsIDsWithoutProduct() {
		return SHELF_REPOSITORY.getIDsWithoutProduct();
	}

}
