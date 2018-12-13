package io.altar.StockManagmentAPI.Business;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import io.altar.StockManagmentAPI.Models.Product;
import io.altar.StockManagmentAPI.Repositories.ProductRepository;

public class ProductBusiness {

	// Initializing;
	@Inject
	ProductRepository productRepository;

	// Save Product
	@Transactional
	public ProductDto saveProduct(Product saveProduct) {
		saveProduct = productRepository.save(saveProduct);
		ProductDto createProduct = new ProductDto(saveProduct.getId(), saveProduct.getDiscountPrice(),
				saveProduct.getIva(), saveProduct.getPvp());
		return createProduct;
	}

	// Update Product
	@Transactional
	public ProductDto updateProduct(Product product) {
		product = productRepository.update(product);
		ProductDto createProduct = new ProductDto(product.getId(), product.getDiscountPrice(), product.getIva(),
				product.getPvp());
		return createProduct;
	}

	// Remove Product
	@Transactional
	public void removeProduct(long id) {
		productRepository.removeByID(id);
	}

	// Get All Products
	public List<ProductDto> getAllProducts() {
		Iterator<Product> getFromDB = productRepository.getAll().iterator();
		List<ProductDto> getAllProductsDto = new ArrayList<ProductDto>(); 
		
		while (getFromDB.hasNext()) { 
			Product productAdd = getFromDB.next();
			ProductDto addProduct = new ProductDto(productAdd.getId(), productAdd.getDiscountPrice(),productAdd.getIva(),productAdd.getPvp());
			getAllProductsDto.add(addProduct);
		}
		
		return getAllProductsDto; 
	}

}
