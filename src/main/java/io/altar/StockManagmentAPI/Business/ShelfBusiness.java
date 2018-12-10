package io.altar.StockManagmentAPI.Business;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

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
	public static ShelfDto getShelfById(Long id) {
		Shelf searchShelf = SHELF_REPOSITORY.findByID(id);
		ShelfDto createShelf = new ShelfDto(searchShelf.getId(), searchShelf.getProduct(),searchShelf.getCapacity(),
				searchShelf.getPrice());
		return createShelf;		
	}

	// Get all Shelfs
	public static Collection<ShelfDto> getAllShelfs() {
		Iterator<Shelf> shelfs = SHELF_REPOSITORY.getAll().iterator();
		Collection<ShelfDto> shelfsDto = new ArrayList<ShelfDto>();
		while (shelfs.hasNext()) {
			Shelf shelf = shelfs.next();
			ShelfDto shelfDto = new ShelfDto(shelf.getId(), shelf.getProduct(),
					shelf.getCapacity(), shelf.getPrice());
			shelfsDto.add(shelfDto);
		}
		return shelfsDto;
	}	

	// Save Shelf
	public static ShelfDto saveShelf(Shelf saveShelf) {
		SHELF_REPOSITORY.save(saveShelf);
		ShelfDto createShelf = new ShelfDto(saveShelf.getId(), saveShelf.getProduct(), saveShelf.getCapacity(),
				saveShelf.getPrice());
		return createShelf;	
	}

	// Update:
	public static ShelfDto replaceShelf(Shelf shelf) {
		SHELF_REPOSITORY.update(shelf);
		ShelfDto createShelf = new ShelfDto(shelf.getId(), shelf.getProduct(),shelf.getCapacity(),
				shelf.getPrice());
		return createShelf;	
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
