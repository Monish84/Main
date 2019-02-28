package com.login;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	Connection con;

	 Connection getConnection() {
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Connection is created...");
		
		
		return con;
	}
	/*public static void main(String[] args)  {
		new DBConnection().getConnection();

	}*/

}
