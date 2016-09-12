package com.cup.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cup.common.Count;

/**
 * Servlet implementation class PageHitCounter
 */
@WebServlet("/PageHitCounter")
public class PageHitCounter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PageHitCounter() {

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		//3sec refresh
		response.setIntHeader("Refresh", 3);
		
		int hitCounts = Count.getHitCounts();
		
		PrintWriter out = response.getWriter();
		String title = "Hit Counts";
		String docType = "<!DOCTYPE html> \n";
		out.println(docType +
	        "<html>\n" +
	        "<head><title>" + title + "</title></head>\n" +
	        "<body bgcolor=\"#f0f0f0\">\n" +
	        "<h1 align=\"center\">" + title + "</h1>\n" +
	        "<h2 align=\"center\">" + hitCounts + "</h2>\n" +
	        "</body></html>");		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
