package com.first;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstController")
public class FirstController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			String uname = request.getParameter("uname");
			String pwd = request.getParameter("pwd");
			
			//int a=10+20;
			
			if((uname.equals("karthik"))&&(pwd.equals("123"))){
				RequestDispatcher rd = request.getRequestDispatcher("/second");
				rd.forward(request, response);
			}else{
				out.println("Invalid Username and Password...");
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);
			}
			
	}
}
