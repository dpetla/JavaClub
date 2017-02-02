<!--
Course: PROG32758 (Java Enterprise)
Assignment: 3
Student: Douglas Petla
-->
<%-- 
    Document   : logout
    Created on : Aug 10, 2016, 6:07:36 PM
    Author     : dpetla
--%>

<%@ page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="main.css" rel="stylesheet" type="text/css"/>
        <title>Logout</title>
    </head>
    <body>
        
        <%
            // close session
            session.invalidate();
        %>
        
        <div class="container">
            <header class="jumbotron">
                <h1>Java Club</h1>
                <p>Write Once, Run Anywhere</p>
            </header>
            <div class="page-header">
                <h1>You are now logged out of Java Club!</h1>
            </div>
                <p>Thank you for visiting Java Club.</p>
            <a href="index.html" class="btn btn-outline-danger" role="button">
                <span class="glyphicon glyphicon-home" aria-hidden="true"></span>
                Go to home page.</a>
        </div>        
        <!-- scripts -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </body>
</html>
