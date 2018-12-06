package io.altar.StockManagmentAPI.Business;

import java.util.Collection;

import io.altar.StockManagmentAPI.Models.Product;
import io.altar.StockManagmentAPI.Repositories.ProductRepository;

public class ProductBusiness {

	// Initializing;
	private static final ProductRepository PRODUCT_REPOSITORY = ProductRepository.getInstance();

	// Get next product ID
	public static long getNextID() {
		return PRODUCT_REPOSITORY.nextID();
	}

	// Get Product by ID
	public static Product getProductById(long id) {
		Product searchProduct = PRODUCT_REPOSITORY.findByID(id);
		return searchProduct;
	}

	// Get All Products
	public static Collection<Product> getAllProducts() {
		return PRODUCT_REPOSITORY.getAll();
	}

	// Save Product
	public static Product saveProduct(Product saveProduct) {
		return PRODUCT_REPOSITORY.save(saveProduct);
	}

	// Replace Product
	public static void replaceProduct(Product product) {
		PRODUCT_REPOSITORY.update(product);
	}

	// Remove Product
	public static void removeProduct(long idToRemove) {
		PRODUCT_REPOSITORY.removeByID(idToRemove);
	}

	// Remove All
	public static void removeAllProducts() {
		PRODUCT_REPOSITORY.removeAll();
	}

	// Check if Repository is Empty
	public static boolean isEmpty() {
		return PRODUCT_REPOSITORY.isEmpty();
	}

}
