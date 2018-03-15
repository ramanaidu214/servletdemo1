package com.sanju.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		res.setContentType("text/html");
		System.out.println("do get method");
		pw=res.getWriter();
		String name = req.getParameter("customername");
		pw.println("<h3>your good name is :: "+name+"<h3>");
		pw.close();
		
	
	}

}
