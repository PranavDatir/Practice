package jdbcinsert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertDemo {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Pranav@3108");
		System.out.println("Success");
		PreparedStatement ps3 = con.prepareStatement("insert into demo values ('4', 'abc', 1234654),('5', 'def', 8653423)");
		ps3.executeUpdate();
		System.out.println("data added");
		PreparedStatement ps = con.prepareStatement("update demo set name='ABC' where id = 4");
		ps.executeUpdate();
		PreparedStatement ps1 =  con.prepareStatement("delete from demo where id='5'");
		ps1.executeUpdate();
		PreparedStatement ps2 =  con.prepareStatement("select * from demo");
		ResultSet rs = ps2.executeQuery();
		while(rs.next()) {
			String name1 = rs.getString("name");
			System.out.println(name1);
		}
	}
}