<!-- index.jsp
Author: Jason Lu (jasonlu6@bu.edu)
UROP Clotho UI Servlet JSP file #2
Date: 6/08/2017
Description:  
-->

<!--
This file is a Java Server Page that will serve as the main user
page (after authentication) for use in conjunction with GET / POST methods 
defined the ClothServlet.java file. 

It will have a redirect link (the BU CIDAR Lab main page?)
in order to circumvent the 404 error caused by 
running the ClothoServlet.java directly in an automatic build setting 
 -->

<!-- Main welcome page to the user (with redirect link) -->

<%@ page import="com.jasonlu.servlet.clotho.ClothoServlet" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Clotho UI User Homepage</title>
</head>
<body>

<!-- welcoming the user randomly -->

<head>Welcome Clotho User!</head>
<br> 

Your author ID is:
<br>
  
AuthorID:
<%= (int) (Math.random() * 10) %>

<br>

Please enter a username and password (for authentication): 
<form>
  Username:<br>
  <input type="text" name="username"><br>
  Password:<br>
  <input type="password" name="password"><br>
  Confirm Password:<br>
  <input type="password" name="password"><br>
  Submit:<br>
  <input type="submit" name="Submit"><br>
</form>

<!-- radio button input for the tasks for the User to do (default: sequence DNA) -->

<br>

Please select one or more of the following task(s) to perform on Clotho: 

<form>
  <input type="radio" name="Sequence DNA"> Sequence DNA<br>
  <input type="radio" name="CRUD operation">Create, Read, Update, or Delete A BioDesign<br>
  <input type="radio" name="BLAST DNA sequencing">Request a BLAST sequencing to compare biological info<br>
  <input type="radio" name="Paginate the Design"> Request pagination on the BioDesign<br>
  <input type="radio" name="Other">Other option (state below):<br>
  <input type="text" name="other option"><br>
  
  Submit your choices:
  <input type="submit" name="Submit"><br>
</form>

</body>
</html>

<!-- re-directing the user back to the site -->

<!--  stackoverflow example (modified) -->
<!--
<html lang="en-US">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="refresh" content="1; url=http://cidarlab.org/">
        <script type="text/javascript">
            window.location.href = "http://cidarlab.org/"
        </script>
        <title>Page Redirection</title>
    </head>
    
    <body>
        If you are not redirected back to the CIDAR LAB home page, 
        follow this <a href='http://cidarlab.org/'>link to example</a>.
    </body>
</html>
-->