package com.ltts.configuration;



import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class MyConnection {
	public static Connection getConnection() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/MiniProject","root","root");
		return c;
	}


}