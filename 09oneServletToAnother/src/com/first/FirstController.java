package com.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstController")
public class FirstController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			String a = request.getParameter("fname");
			out.println("first============="+a);
			
			out.println("<form method='get' action='second'>");
			out.println("LastName :<input type='text' name = 'lname'>");
			out.println("<input type='submit' value='Second'>");
			out.println("</form>");
			
			//out.println("<a href = 'second'>Next Page</a>");
	}

}
