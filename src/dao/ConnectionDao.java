package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDao {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://172.16.51.41/clinicdb?useSSL=false", "soisuser", "Sois@123");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
