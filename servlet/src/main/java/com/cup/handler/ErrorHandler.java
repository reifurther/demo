package com.cup.handler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ErrorHandler
 */
@WebServlet("/ErrorHandler")
public class ErrorHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ErrorHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Throwable throwable = (Throwable) request.getAttribute("javax.servlet.error.exception");
		Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
		String servletName = (String) request.getAttribute("javax.servlet.error.servlet_name");
				if (servletName == null){
					servletName = "Unknown";
				}
				String requestUri = (String)
				request.getAttribute("javax.servlet.error.request_uri");
				if (requestUri == null){
					requestUri = "Unknown";
				}
				//
				response.setContentType("text/html;charset=UTF-8");
			
				PrintWriter out = response.getWriter();
				String title = " Error/Exception Info ";
			   
				String docType = "<!DOCTYPE html>\n";
				out.println(docType +
			    	"<html>\n" +
			     	"<head><title>" + title + "</title></head>\n" +
			     	"<body bgcolor=\"#f0f0f0\">\n");
			   	out.println("<h1>Info</h1>");
			   	if (throwable == null && statusCode == null){
			      	out.println("<h2>error catch</h2>");
			      	out.println("<a href=\"" + 
			        response.encodeURL("http://localhost:8080/") + 
			        	"\"></a>");
			   	}else if (statusCode != null) {
			      	out.println("status code: " + statusCode);
				}else{
				   	out.println("<h2>error info</h2>");
			      	out.println("Servlet Name : " + servletName + 
			                          "</br></br>");
			      	out.println("class : " + 
			                          throwable.getClass( ).getName( ) + 
			                          "</br></br>");
			      	out.println("URI: " + requestUri + 
			                          "<br><br>");
			      	out.println("error message: " + 
			                              throwable.getMessage( ));
			   	}
			   	out.println("</body>");
			   	out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
