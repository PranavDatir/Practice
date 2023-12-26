package dac;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {
	
	public static Connection buildConnection() throws Exception {
		String driverClass = "com.mysql.cj.jdbc.Driver";
		Class.forName(driverClass);
		String connectionUrl = "jdbc:mysql://localhost:3306/jdbc_db?useSSL=false";
		String userId = "root";
		String password = "Pranav@3108";
		Connection dbConnection = DriverManager.getConnection(connectionUrl, userId, password);
		System.out.println("Connection Successful");
		return dbConnection;
		
	}
}
