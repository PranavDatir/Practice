package day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleSelectQueryMain {

	public static void main(String[] args) {
		// 1. Load the Driver
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		Connection dbConnection = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driverClassName);
			System.out.println("Driver Loaded");
			
			//2.Establish Connection
			String connectionURL = "jdbc:mysql://localhost:3306/Java_Database";
			String userID = "root";
			String password = "Pranav@3108";
			
			dbConnection = DriverManager.getConnection(connectionURL, userID, password);
			System.out.println("Database Connected");
			
			//3.Obtaining Statement
			stmt = dbConnection.createStatement();
			
			//4.Executing SQL Query
			String sqlQuery = "select * from restaurant";
			rs = stmt.executeQuery(sqlQuery);
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String cuisine = rs.getString(3);
				int branches = rs.getInt(4);
				
				System.out.println(id + ", "+ name + ", "+ cuisine + ", "+ branches);
		    }
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				stmt.close();
				dbConnection.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
