package io.altar.StockManagmentAPI.Services;


import javax.ws.rs.POST;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/Products")
public class ProductsService {
	

	@POST	
	@Produces(MediaType.APPLICATION_JSON)
	public String addMessage(){		
		
		return "Products POST WORKED!";
	}
	
//	@GET
//    @Path("/")
//	@Produces(MediaType.APPLICATION_JSON)
	
	

}
