package com.gallup.gethip.resources;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/decorations")
public class DecorationResource {
	@Path("/all")
	@GET
	@Produces("application/json")
	public static String rOne(){
		return DecorationService.getAll("");
	}
	
	@Path("/all")
	@GET
	@Produces("application/json")
	public static String rTwo(@PathParam("limit") String filter){
		return DecorationService.getAll(filter);
	}
}
