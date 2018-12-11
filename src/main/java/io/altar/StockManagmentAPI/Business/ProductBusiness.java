package io.altar.StockManagmentAPI.Business;

import javax.inject.Inject;
import javax.transaction.Transactional;

import io.altar.StockManagmentAPI.Models.Product;
import io.altar.StockManagmentAPI.Repositories.ProductRepository;

public class ProductBusiness {

	// Initializing;
	@Inject
	private static final ProductRepository PRODUCT_REPOSITORY = ProductRepository.getInstance();

	
	// Save Product
	@Transactional
	public static ProductDto saveProduct(Product saveProduct) {
		PRODUCT_REPOSITORY.save(saveProduct);
		ProductDto createProduct = new ProductDto(saveProduct.getId(), saveProduct.getDiscountPrice(),
				saveProduct.getIva(), saveProduct.getPvp());
		return createProduct;
	}
	
	// Update Product
	@Transactional
	public static ProductDto updateProduct(Product product) {
		PRODUCT_REPOSITORY.update(product);
		ProductDto createProduct = new ProductDto(product.getId(), product.getDiscountPrice(), product.getIva(),
				product.getPvp());
		return createProduct;
	}
	
	// Remove Product
	@Transactional
	public static void removeProduct(long idToRemove) {
		PRODUCT_REPOSITORY.removeByID(idToRemove);
	}

	// // Get next product ID
	// public static long getNextID() {
	// return PRODUCT_REPOSITORY.nextID();
	// }
	//
	// // Get Product by ID
	// public static ProductDto getProductById(long id) {
	// Product searchProduct = PRODUCT_REPOSITORY.findByID(id);
	// ProductDto createProduct = new ProductDto(searchProduct.getId(),
	// searchProduct.getDiscountPrice(),
	// searchProduct.getIva(), searchProduct.getPvp());
	// return createProduct;
	// }
	//
	// // Get All Products
	// public static Collection<ProductDto> getAllProducts() {
	// Iterator<Product> products = PRODUCT_REPOSITORY.getAll().iterator();
	// Collection<ProductDto> productsDto = new ArrayList<ProductDto>();
	//
	// while (products.hasNext()) {
	// Product product = products.next();
	// ProductDto productDto = new ProductDto(product.getId(),
	// product.getDiscountPrice(),
	// product.getIva(), product.getPvp());
	// productsDto.add(productDto);
	// }
	// return productsDto;
	// }
	//
	// // Remove All
	// public static void removeAllProducts() {
	// PRODUCT_REPOSITORY.removeAll();
	// }
	//
	// // Check if Repository is Empty
	// public static boolean isEmpty() {
	// return PRODUCT_REPOSITORY.isEmpty();
	// }

}
