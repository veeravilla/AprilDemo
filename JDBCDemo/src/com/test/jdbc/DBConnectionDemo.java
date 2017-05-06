package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionDemo {

	public static void main(String[] args) throws Exception{
		
		//Load DB Driver
		Class.forName("com.mysql.jdbc.Driver");
		

		Connection connection = DriverManager.
								getConnection("jdbc:mysql://localhost:3306/april2017","root","root");
	
		//Do JDBC Operations
		System.out.println(connection);
	
		//close connection
		//Demo GitBub
		connection.close();
	}

}
