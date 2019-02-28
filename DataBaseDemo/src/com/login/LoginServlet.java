package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String name1 = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		
		PrintWriter out=response.getWriter();
		
		DBConnection db = new DBConnection();
		Connection con = db.getConnection();
	
		String str = "select * from person where name='"+name1+"' and pass='"+pwd+"'";
		String name;
		String pass;
		
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(str);
			while(rs.next()){
				//System.out.println("while loop");
				name = rs.getString("name");
				pass = rs.getString("pass");
				//System.out.println(name);
				//System.out.println(pass);
				if(name1.equals(name)&&pass.equals(pwd)){
					out.println("Login Successfully....");			
				}
			}
		} catch (SQLException e) {	
			e.printStackTrace();
		}	
	}
}
