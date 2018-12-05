package io.altar.StockManagmentAPI.Services;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.altar.StockManagmentAPI.Business.ProductBusiness;
import io.altar.StockManagmentAPI.Models.Product;


@Path("/products")
public class ProductsService {

	
	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Product addProduct(Product product) {		
		return ProductBusiness.editProduct(product);	
	}

}
