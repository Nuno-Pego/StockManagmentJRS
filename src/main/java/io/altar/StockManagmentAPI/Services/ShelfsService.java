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

import io.altar.StockManagmentAPI.Business.ShelfBusiness;
import io.altar.StockManagmentAPI.Business.ShelfDto;
import io.altar.StockManagmentAPI.Models.Shelf;

@Path("/shelf")
public class ShelfsService {

	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ShelfDto addShelf(Shelf shelf) {
		return ShelfBusiness.saveShelf(shelf);
	}

	@POST
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Shelf updateShelf(Shelf shelf) {
		ShelfBusiness.replaceShelf(shelf);
		return shelf;
	}

	@DELETE
	@Path("/deleteById/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response removeShelfById(@PathParam("id") long id) {
		ShelfBusiness.removeShelf(id);
		return Response.ok().build();
	}

	// @GET
	// @Path("/getAll")
	// @Produces(MediaType.APPLICATION_JSON)
	// public Collection<ShelfDto> getAllShelfs(){
	// return ShelfBusiness.getAllShelfs();
	// }
	//
	// @GET
	// @Path("/getById/{id}")
	// @Produces(MediaType.APPLICATION_JSON)
	// public ShelfDto getShelfById(@PathParam("id") long id){
	// return ShelfBusiness.getShelfById(id);
	// }
	//
	// @DELETE
	// @Path("/deleteAll")
	// @Produces(MediaType.APPLICATION_JSON)
	// public Response removeAllShelfs(){
	// ShelfBusiness.removeAllShelfs();
	// return Response.ok().build();
	// }

}
