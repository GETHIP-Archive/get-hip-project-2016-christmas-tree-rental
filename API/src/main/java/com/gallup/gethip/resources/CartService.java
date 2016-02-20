package com.gallup.gethip.resources;
import com.gallup.gethip.resources.DatabaseResource;
public class CartService {
	//GET methods
	public static String getAll() {
		String output;
		output = "";
		try {
			DatabaseResource connect = new DatabaseResource();	
			output = connect.getData("SELECT * FROM cart;");
		} catch (Exception ex) {
			System.out.println("Error retrieving all from cart: " + ex);
		}
		return output;
	}
	public static String getId(String id) {
		String output;
		output = "";
		try {
			DatabaseResource connect = new DatabaseResource();	
			output = connect.getData("SELECT * FROM cart WHERE productid='" + id + "''");
		} catch (Exception ex) {
			System.out.println("Error retrieving item by id: " + ex);
		}
		return output;
	}
	public static String getAddDate(String when) {
		String output;
		output = "";
		try {
			DatabaseResource connect = new DatabaseResource();	
			output = connect.getData("SELECT * FROM cart WHERE dateadded='" + when + "';");
		} catch (Exception ex) {
			System.out.println("Error retrieving item by date: " + ex);
		}
		return output;
	}
}
