package io.altar.StockManagmentAPI.Business;

import java.util.ArrayList;
import java.util.Collection;

import io.altar.StockManagmentAPI.Models.Product;
import io.altar.StockManagmentAPI.Repositories.ProductRepository;

public class ProductBusiness{
	
	// Initializing;
	private static final ProductRepository PRODUCT_REPOSITORY = ProductRepository.getInstance();
	
	// Create a product
	public static Product createProduct (int discount, int iva, double pvp){
		Product newProduct = new Product(discount, iva, pvp);
		return PRODUCT_REPOSITORY.save(newProduct);
	}
	
	public static void createProduct (ArrayList<Long> shelfsIDs, int discount, int iva, double pvp){
		Product newProduct = new Product(shelfsIDs, discount, iva, pvp);
		PRODUCT_REPOSITORY.save(newProduct);
	}
	
	// Get Data size
	public static int getSizeOfData(){
		return PRODUCT_REPOSITORY.lenghtData();				
	}
	
	// Get actual product ID
	public static long getActualID(){
		return PRODUCT_REPOSITORY.getActualID();
	}
		
	// Get next product ID
	public static long getNextID(){
		return PRODUCT_REPOSITORY.nextID();
	}
	
	// Get Product by ID
	public static Product getProductById (long id){
		Product searchProduct = PRODUCT_REPOSITORY.findByID(id);
		return searchProduct;
	}
	
	// Get All Products
	public static Collection<Product> getAllProducts(){
		return PRODUCT_REPOSITORY.getAll();
	}
	
	// Get All Product ID's
	public static Collection<Long> getAllProductsIDs(){
		return PRODUCT_REPOSITORY.getAllIDs();
	}
	
	// Edit Product
	public static Product editProduct (Product editProduct){
		return PRODUCT_REPOSITORY.save(editProduct);
	}
	
	// Remove Product
	public static void removeProduct (long idToRemove){
		PRODUCT_REPOSITORY.removeByID(idToRemove);
	}
	
	// Check if Repository is Empty
	public static boolean isEmpty(){
		return PRODUCT_REPOSITORY.isEmpty();
	}

}
