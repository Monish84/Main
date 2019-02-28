package com.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstController")
public class FirstController extends HttpServlet {
	
	public void init() {
		System.out.println("init method... ");
	}
	
	public void init(ServletConfig config) {
		System.out.println("init method parameter...");
	}
	
	public void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		System.out.println("service method....");
		doGet(request,response);
	}
	public void destroy(){
		System.out.println("destroy method....");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			response.setContentType("text/javascript");
			PrintWriter out = response.getWriter();
			System.out.println("doGet.....");
			out.println("doGet.....");
	}
}
