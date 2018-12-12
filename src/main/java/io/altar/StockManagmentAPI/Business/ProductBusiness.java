package io.altar.StockManagmentAPI.Business;

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
		productRepository.save(saveProduct);
		ProductDto createProduct = new ProductDto(saveProduct.getId(), saveProduct.getDiscountPrice(),
				saveProduct.getIva(), saveProduct.getPvp());
		return createProduct;
	}

	// Update Product
	@Transactional
	public ProductDto updateProduct(Product product) {
		productRepository.update(product);
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
	public List<Product> getAllProducts() {
		return productRepository.getAll();
	}

}
