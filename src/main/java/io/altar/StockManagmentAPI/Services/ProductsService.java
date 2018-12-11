package io.altar.StockManagmentAPI.Services;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.altar.StockManagmentAPI.Business.ProductBusiness;
import io.altar.StockManagmentAPI.Business.ProductDto;
import io.altar.StockManagmentAPI.Models.Product;

@Path("/product")
public class ProductsService {

	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ProductDto addProduct(Product product) {
		return ProductBusiness.saveProduct(product);
	}

	@POST
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ProductDto updateProduct(Product product) {
		return ProductBusiness.updateProduct(product);
	}

	@DELETE
	@Path("/deleteById/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response removeProductById(@PathParam("id") long id) {
		ProductBusiness.removeProduct(id);
		return Response.ok().build();
	}

	// @GET
	// @Path("/getAll")
	// @Produces(MediaType.APPLICATION_JSON)
	// public Collection<ProductDto> getAllProducts() {
	// return ProductBusiness.getAllProducts();
	// }
	//
	// @GET
	// @Path("/getById/{id}")
	// @Produces(MediaType.APPLICATION_JSON)
	// public ProductDto getProductById(@PathParam("id") long id) {
	// return ProductBusiness.getProductById(id);
	// }
	//
	// @DELETE
	// @Path("/deleteAll")
	// @Produces(MediaType.APPLICATION_JSON)
	// public Response removeAllProducts() {
	// ProductBusiness.removeAllProducts();
	// return Response.ok().build();
	// }

}
