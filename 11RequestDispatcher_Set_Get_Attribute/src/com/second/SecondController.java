package com.second;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SecondController")
public class SecondController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
			PrintWriter out = response.getWriter();
			
			String a = (String)request.getAttribute("name");
			
			System.out.println("Second Servlet.....");
			out.println("SecondController=============="+a);
	}
}