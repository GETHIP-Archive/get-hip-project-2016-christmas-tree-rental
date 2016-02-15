package com.gallup.gethip.resources;

public class DecorationService {
	//GET Methods
	public static String getAll() {
		String output;
		DatabaseResource connect = new DatabaseResource();	
		output = connect.getData("SELECT * FROM decorations ORDER BY name;");
		return output;
	}
	public static String getHoliday(String h) {
		String output;
		DatabaseResource connect = new DatabaseResource();
		output = connect.getData("SELECT * FROM decorations WHERE holiday = '" + h + "' ORDER BY name;");
		return output;
	}
	public static String getProductId(String i) {
		String output;
		DatabaseResource connect = new DatabaseResource();
		//String i does not need to be an int because it needs to concat with a string for MySQL
		output = connect.getData("SELECT * FROM decorations WHERE productid = '" + i + "';");
		return output;
	}
	public static String getProductName(String n) {
		String output;
		DatabaseResource connect = new DatabaseResource();
		output = connect.getData("SELECT * FROM decorations WHERE name = '" + n + "';")
		return output;
	}
}
