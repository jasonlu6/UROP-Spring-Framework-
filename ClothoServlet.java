// File: ClothoServlet.java
// Author: Jason Lu (jasonlu6@bu.edu)
// UROP Clotho UI Servlet Java File #1 
// Date: 6/09/2017
// Description: 

/* This file is a skeleton implementation of a Java Servlet to create a web application that will be
 * the basis of the Clotho UI web page (in dynamic web page format). In addition, it will connect to mongoDB and the 
 * Apache Tomcat server for back-end requests / fetch user response for DNA sequencing and CRUD methods implementation */

/* Helper function files:
 * user.jsp [for the user Java Server Page]
 *  */

/* 
 * Major Bug to Fix (not including within only the scope of this file): 
 * 
 * Running ClothoServlet is always causing the HTTP status error 404 (even with an additional web.xml 
 * and fixed pom.xml file). Tried all sorts of approaches (even terminal command path
 * file directory manipulations) (at least 20) given from Stack Overflow,
 * and been debugging it for most of the afternoon (specifically from 12:30 pm to now at almost 5:30 pm)
 * 
 * Ask Yury first thing tomorrow (if he is there) how to fix such an obscure
 * and unhelpful error?! 
 * 
 */

// potential fix: 
/* make a secondary index.html / index.jsp to re-direct the servlet (circumvent the 404 error) */ 

// Mongo Connection Code: connect the java source file with mongoDB 
// middleware connection with the user.jsp file 

// personally defined package 
package com.jasonlu.servlet.clotho;

// main java import 

// it will generally handle most cases for exceptions and other dependencies 
import java.io.IOException;
import java.io.PrintWriter;

/* optional imports */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.RequestDispatcher;

// importing of mongo (Java Objects all inclusive)
import java.lang.Object.*;

/**
 * Servlet implementation class ClothoServlet
 */

/* Stackoverflow attempt at resolving the problem */ 

// @WebServlet(asyncSupported = false, name = "ClothoServlet", urlPatterns = {"/hello1}"})

@SuppressWarnings("unused")
public class ClothoServlet extends HttpServlet {
	
	// suppressed warning 
	@SuppressWarnings("unused")
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
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
			// throws ServletException, IOException {
		
		// create the data model and add it to the request object 
		String welcome[] = {"Hello!", "Welcome to the Clotho UI Starter Web page.", "Please enter your username", "password"};
		request.setAttribute("myWelcome", welcome);
		
		// retrieve request dispatcher (the user using Clotho UI)
		com.jasonlu.servlet.clotho.RequestDispatcher requestDispatcher = request.getRequestDispatcher("user.jsp");
		
		// forward the request to the view
		requestDispatcher.forward(request, response);
		// ((com.jasonlu.servlet.clotho.RequestDispatcher) requestDispatcher).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
			// throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	// mongo connection using the MongoClient class 
	// default localhost for mongo: 27017 
	
	// MongoClient mongo = new MongoClient();
	
	// since Clotho is in secure mode (no outside access), authentication required
	// create an instance of Mongo
	
	Mongo mongo = new Mongo("localhost",27017);
	MongoClient mongoClient = new MongoClient(); 
	// database object that is contained in mongoDB
	DB db = ((MongoClient) mongoClient).getDB("database name");
	// authentication boolean
	// boolean auth = db.authenticate("username","password".toCharArray());
	boolean auth = db.authenticate("username","password");
	
	// connection to the mongoDB (testClotho) 
	DB db2 = mongo.getDB("testClotho");
	
	// get the mongoDB collection / table 
	DB db3 = mongo.getDB("testClotho");
	DBCollection table = db.getCollection("data");
	
	// save the example (if necessary) 
	
	// update the example (if necessary) 
	
	// find the example (if necessary) 
	
	// delete the example (if necessary) 
}
