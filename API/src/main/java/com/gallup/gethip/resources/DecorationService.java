package com.gallup.gethip.resources;
import DatabaseResource;
public class DecorationService {
	//GET Methods
	public static String getAll() {
		//Declared 'output' outside of try/catch so if the database connection failed, the function could still return a string and not break the whole thing
		String output;
		output = "";
		try {
			DatabaseResource connect = new DatabaseResource();	
			output = connect.getData("SELECT * FROM decorations ORDER BY name;");
		} catch (Exception ex) {
			System.out.println("Error retrieving all decorations: " + ex);
		}
		return output;
	}
	public static String getHoliday(String h) {
		String output;
		output = "";
		try {
			DatabaseResource connect = new DatabaseResource();
			output = connect.getData("SELECT * FROM decorations WHERE holiday = '" + h + "' ORDER BY name;");
		} catch (Exception ex) {
			System.out.println("Error retrieving decorations by holiday: " + ex);
		return output;
	}
	public static String getProductId(String i) {
		String output;
		output = "";
		try {
			DatabaseResource connect = new DatabaseResource();
			//String i does not need to be an int because it needs to concat with a string for MySQL
			output = connect.getData("SELECT * FROM decorations WHERE productid = '" + i + "';");
		} catch (Exception ex) {
			System.out.println("Error retrieving decorations by product id: " + ex);
		}
		return output;
	}
	public static String getProductName(String n) {
		String output;
		output = "";
		try {
			DatabaseResource connect = new DatabaseResource();
			output = connect.getData("SELECT * FROM decorations WHERE name = '" + n + "';")
		} catch (Exception ex) {
			System.out.println("Error retrieving decorations by product name: " + ex);
		return output;
	}
}
