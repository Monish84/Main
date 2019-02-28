package com.add;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddController")
public class AddController extends HttpServlet {
	
	public int add(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String a = request.getParameter("A");
		String b = request.getParameter("B");
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		int z = a1 + b1;
		out.println("add===========" +z);
		return z;
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			response.setContentType("text/html");
			
			add(request,response);
	}

}
