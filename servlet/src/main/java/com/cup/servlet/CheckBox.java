package com.cup.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckBox
 */
@WebServlet("/CheckBox")
public class CheckBox extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckBox() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// checkbox demo
		
response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		String title = "use POST method to read checkbox data.";
		String docType = "<!DOCTYPE html>\n";
		
		out.println(docType +
				"<html>\n" +
				"<head><title>" + title + "</title></head>\n" +
				"<body bgcolor=\"#f0f0f0\">\n" +
			    "<h1 align=\"center\">" + title + "</h1>\n" +
			    "<ul>\n" +
			    "  <li><b>Option A</b>£º"
			    + request.getParameter("option_a") + "\n" +
			    "  <li><b>Option B</b>£º"
			    + request.getParameter("option_b") + "\n" +
			    "  <li><b>Option C</b>£º"
			    + request.getParameter("option_c") + "\n" +
			    "</ul>\n" +
			    "</body></html>");
		
		Enumeration<String> parameter = request.getParameterNames();
		
		while(parameter.hasMoreElements()){
			String param = parameter.nextElement().toString();
			System.out.println("parameter:" + param);
			System.out.println(request.getParameter(param));
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
