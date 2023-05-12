package Utilities;

import java.sql.*;

@SuppressWarnings("unused")
public class DBUtils {

	private static Connection cn;

	// Firstly, we're adding a static method to open DB Connection.

	public static Connection openConnection() throws SQLException {
		// Here, DriverManager : Connection getConnection(URL, UserName, Password))
		String url = "jdbc:mysql://localhost:3306/advjava?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true";

		cn = DriverManager.getConnection(url, "root", "JoeRoot123");

		return cn;

	}

}
