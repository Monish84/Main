

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstController extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			
		String x = request.getParameter("a");
		String y = request.getParameter("b");
		
		PrintWriter out = response.getWriter();
		int a = Integer.parseInt(x);
		int b = Integer.parseInt(y);
		int c = a+b;
		
		out.println("The added Value is : "+c);
		}
}
