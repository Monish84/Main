package com.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.BeanImpl;

@WebServlet("/SessionTest")
public class SessionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	
		String name=request.getParameter("name");
		String f_name=request.getParameter("f_name");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		
		PrintWriter out = response.getWriter();
		/*out.println(name+"<br>");
		out.println(f_name+"<br>");
		out.println(city+"<br>");
		out.println(state+"<br>");*/
		
			BeanImpl ob = new BeanImpl();
			ob.setName(name);
			ob.setF_name(f_name);
			ob.setCity(city);
			ob.setState(state);
			
			HttpSession session = request.getSession();
			session.setAttribute("obj", ob);
			
			out.println("<html><body><form action='nextServlet' method='get'>");
			out.println("<br>");
			out.println(" <input type='submit' value='Next'>");
			out.println("</form></body></html>");
			
		}
  	}
