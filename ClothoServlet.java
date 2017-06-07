// File: ClothoServlet.java
// Author: Jason Lu (jasonlu6@bu.edu)
// UROP Clotho UI Servlet Java File #1 
// Date: 6/07/2017
// Description: 

/* This file is a skeleton implementation of a Java Servlet to create a web application that will be
 * the basis of the Clotho UI web page (in dynamic web page format). In addition, it will connect to mongoDB and the 
 * Apache Tomcat server for back-end requests / fetch user response for DNA sequencing and CRUD methods implementation */

/* Helper function files:
 * user.jsp [for the user Java Server Page]
 *  */

package com.jasonlu.servlet.clotho;

import java.io.IOException;

/* optional imports */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.RequestDispatcher;

/**
 * Servlet implementation class ClothoServlet
 */

@WebServlet("/ClothoServlet")
public class ClothoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ClothoServlet() {
    	super();
    	
    	
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// create the data model and add it to the request object 
		String welcome[] = {"Hello!", "Welcome to the Clotho UI Starter Web page.", "Please enter your username", "password"};
		request.setAttribute("myWelcome", welcome);
		
		// retrieve request dispatcher (the user using Clotho UI)
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("user.jsp");
		
		// forward the request to the view
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
