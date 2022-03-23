package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class covidb {
	
		public static Connection getConnection() throws SQLException {
			
			String driverName="org.postgresql.Driver";
			Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost/student","postgres","postgres");
			
			return conn;
			
		}

}
