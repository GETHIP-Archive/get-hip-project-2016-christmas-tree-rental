package com.gallup.gethip.resources;
import DatabaseResource;
public class CartService {
	public static String getAll() {
		String output;
		output = "";
		try {
			output = connect.getData("SELECT * FROM cart;");
		} catch (Exception ex) {
			System.out.println("Error retrieving all from cart: " + ex);
		}
		return output;
	}
	public static String getId(id) {
		String output;
		output = "";
		try {
			output = connect.getData("SELECT * FROM cart WHERE productid='" + id + "''");
		} catch (Exception ex) {
			System.out.println("Error retrieving item by id: " + ex);
		{
		return output;
	}
	public static String getAddDate(when) {
		String output;
		output = "";
		try {
			output = connect.getData("SELECT * FROM cart WHERE dateadded='" + when + "';");
		} catch (Exception ex) {
			System.out.println("Error retrieving item by date: " + ex);
		}
		return output;
	}
}
