package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleQuery {

	//Program to fire SELECT query to get the data from DB and print the same.
	public static void main(String[] args) {
		// 1. Load Driver
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driverClassName);
			System.out.println("Driver Loaded");
			
			//2. Establishing Connection
			String connectionURL = "jdbc:mysql://localhost:3306/Java_Database";
			String userID = "root";
			String password = "Pranav@3108";
			
			Connection dbConnection = DriverManager.getConnection(connectionURL, userID, password);
			System.out.println("Connected to Database");
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		

	}

}
