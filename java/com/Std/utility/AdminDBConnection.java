package com.Std.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdminDBConnection {
	public static Connection connect() {
		Connection con=null;;
		try {
			//loading driver4
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
	
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
}