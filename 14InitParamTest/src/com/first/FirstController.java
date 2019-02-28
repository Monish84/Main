package com.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
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
			//out.println("FirstController.........."+"<br>");
			
			//ServletConfig sc = getServletConfig();
			//String a = sc.getInitParameter("abc");
			
			String a = getServletConfig().getInitParameter("abc");
			
			out.println("MailId from init parameter ========="+a+"<br>");
			
			//or
			//String b = getServletConfig().getInitParameter("abc");
			//out.println("MailId from init parameter ========="+b);
	}
}
