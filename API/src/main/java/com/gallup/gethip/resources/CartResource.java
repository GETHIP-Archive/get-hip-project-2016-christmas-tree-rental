package com.gallup.gethip.resources;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import CartResource;
@Path("/api")
public class CartResource {
	@GET
	@Produces("application/json")
	public static String alpha() {
		return CartService.getAll("");
	}
	@Path("/all")
	@GET
	@Produces("application/json")
	public static String bravo() {
		return CartService.getAll("");
	}
	@Path("/id/{productId}")
	@GET
	@Produces("application/json")
	public static String charlie(@PathParam("productId" String pid)) {
		return CartService.getId(pid);
	}
	@Path("/dateadded/{addDate}")
	@GET
	@Produces("application/json")
	public statuc String delta(@PathParam("addDate" String addDate)) {
		return CartService.getAddDate(addDate);
	}
}
