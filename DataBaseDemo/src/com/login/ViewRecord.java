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

@WebServlet("/ViewRecord")
public class ViewRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection con;
	ResultSet rs;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String name1 = request.getParameter("select");
		PrintWriter out=response.getWriter();
		DBConnection db = new DBConnection();
		con = db.getConnection();
		String str = "select * from person where name='"+name1+"'";
		try {
			Statement st = con.createStatement();
			rs = st.executeQuery(str);
			while(rs.next()){
				out.println("The Username is : "+rs.getString("name")+"<br>");
				out.println("The User Password is : "+rs.getString("pws"));
			}
		} catch (SQLException e) {	
			e.printStackTrace();
		}
		finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
