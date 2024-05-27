package com.codegnan.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class ServletDemo_02
 */
public class ServletDemo_02 extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String branch=request.getParameter("branch");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>studentParameters</title>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("username :"+name+"<br/>");
		out.println("id :"+id+"<br/>");
		out.println("email :"+email+"<br/>");
		out.println("branch :"+branch+"<br/>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
