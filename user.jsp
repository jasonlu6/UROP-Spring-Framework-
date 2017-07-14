<!-- user.jsp
Author: Jason Lu (jasonlu6@bu.edu)
UROP Clotho UI Servlet JSP file #1 
Date: 6/09/2017
Description:  
-->

<!--
This file is a Java Server Page that will display the main content 
of the starter Clotho UI, which in skeleton form, will render some 
text to be displayed to the user. 
 -->
 
 <!--  Modification: the user can also now access the data presented in the  testClotho mongo
 database file -->

<!-- Main welcome page to the user -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to the Clotho UI!</title>
</head>
<body>

<!-- add some color to make it less boring -->

<p>

<body>
	<p style="color:#333BFF";>
Clotho is an interactive client-server defined database system
that helps with and promotes synthetic biology research with 
universities and colleges throughout the United States
</body>

<p>

<body>
	<p style="color:#FF0000";>I am the undergrad UI developer for the 
	Boston University CIDAR Lab group.
</body>

</body>
</html>

<!-- getting the current date and time (similar 
to that of a real website) / JSP Date / Time mainframe -->

<!-- java imports: I/O, Util, and Servlet -->
<!--  import java.io.*; -->
<!--  import java.util.*; -->
<!--  import javax.servlet.*; -->

<%@ page import = "java.io.*, java.util.*, javax.servlet.*" %>

<html>
	<head>
		<title>Current Date and Time</title>
	</head>
	
	<body>
		<center>
			<h1>Display Current Date and Time:</h1>
		</center>
		
		<!-- Java embedded in the JSP
		(using the Date() Java object -->
		<%
			Date date = new Date();
			out.print("<h2 align = \"center\">" + date.toString()+ "</h2>");
		%>
	</body>
</html>

<!-- To Do (for 6/09/2017 and the weekend): -->
<!-- 1) Figure out a way to connect to mongoDB (SQL as middleware) -->
<!-- 2) Be able to connect to the mongo data, and display in the UI -->
<!-- 3) Configure the beans / dependencies necessary -->
<!-- 4) Wrapper functions are a MUST if the user is to update / delete the query 
(avoid over-writing the previously stored data in case the user changes back) -->

<!-- 4b) Maybe figure out a way for user to undo a CRUD method call to sequence? -->
<!-- 5) Abstract user from data -->

<!-- connecting to mongoDB -->

