package com.ac.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class BookDB {

	
	public static Connection getConnection() //13
			  throws Exception
			  {
				  
				  
				
				 String driverName = "org.postgresql.Driver";
				  Class.forName(driverName);
				  Connection conn = DriverManager.getConnection(
				             "jdbc:postgresql://localhost/mayank","postgres","postgres"
				             		+  "");
				
				return conn; 
			  }

}
