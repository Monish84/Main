package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection con;
	PreparedStatement pr;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String dob = request.getParameter("dob");
		String pass = request.getParameter("pwd");
		String pass1 = request.getParameter("pwd1");
		String addr = request.getParameter("addr");
		
		PrintWriter out = response.getWriter();
		//out.println("The Name is====> "+name+"<br>");
		//out.println("The Password is====> "+pws);
		
		try{
			con = new DBConnection().getConnection();
			String str = "insert into person values(?,?,?,?,?)";
			pr = con.prepareStatement(str);
			pr.setString(1, name);
			pr.setString(2, dob);
			pr.setString(3, pass);
			pr.setString(4, pass1);
			pr.setString(5, addr);
			int a = pr.executeUpdate();
			if(a>0){
				out.println("Value is Inserted....");
				RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
				rd.include(request, response);
			}else{
				out.println("Value is not inserted...");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
