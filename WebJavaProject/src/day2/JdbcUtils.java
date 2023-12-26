package day2;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {
	public static Connection buildConnection() throws Exception {
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		Class.forName(driverClassName);
		String connectionURL = "jdbc:mysql://localhost:3306/Java_Database?useSSL=false";
		String userId = "root";
		String password = "Pranav@3108";
		Connection dbConnection = DriverManager.getConnection(connectionURL, userId, password);
		return dbConnection;
	}
}
