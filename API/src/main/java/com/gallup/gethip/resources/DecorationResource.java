package com.gallup.gethip.resources;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.gallup.gethip.resources.DecorationService;
@Path("/api")
public class DecorationResource {
	//[Default] Outputs all decorations (example.com/api)
	@GET
	@Produces("application/json")
	public static String rZero() {
		return DecorationService.getAll();
	}
	//Outputs all decorations (example.com/api/all)
	@Path("/all")
	@GET
	@Produces("application/json")
	public static String rOne() {
		return DecorationService.getAll();
	}
	//Outputs all decorations for the specified holiday (example.com/api/holiday/easter)
	@Path("/holiday/{hday}")
	@GET
	@Produces("application/json")
	//Saves holiday name from URL to the String hday
	public static String rTwo(@PathParam("hday") String hday) {
		return DecorationService.getHoliday(hday);
	}
	//Outputs the product info of the product with the specified id (example.com/api/22)
	@Path("/id/{productid}")
	@GET
	@Produces("application/json")
	//Saves product id from URL to the String id which will be converted to int in DecorationService method
	public static String rThree(@PathParam("productid") String id) {
		return DecorationService.getProductId(id);
	}
	//Outputs the product info of the product with the specified name (example.com/api/product/Plastic%20Tree) ~ URLs use '%20' instead of spaces
	@Path("/product/{name}")
	@GET
	@Produces("application/json")
	//Saves product name from URL to the String productname
	public static String rFour(@PathParam("name") String productname) {
		return DecorationService.getProductName(productname);
	}
}
