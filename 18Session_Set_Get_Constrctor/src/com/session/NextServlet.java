package com.session;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.BeanImpl;

@WebServlet("/NextServlet")
public class NextServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession(false);
		BeanImpl ob1 = (BeanImpl) session.getAttribute("obj");

		out.println(ob1.getName() + "<br>");
		out.println(ob1.getF_name() + "<br>");
		out.println(ob1.getCity() + "<br>");
		out.println(ob1.getState() + "<br>");

	}

}
