<!--
Course: PROG32758 (Java Enterprise)
Assignment: 3
Student: Douglas Petla
-->
<%-- 
    Document   : registerResult
    Created on : Aug 10, 2016, 5:51:01 PM
    Author     : dpetla
--%>

<%@ page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <link href="main.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <title>Registration Result</title>
    </head>
    <body>
        <div class="container center-container">
            <header class="jumbotron">
                <h1>Java Club</h1>
                <p>Write Once, Run Anywhere</p>
            </header>
            <p class="lead">${signupMessage}</p>
            <a href="index.html" class="btn btn-primary" role="button">Go To Main Page</a>
        </div>
         <!-- scripts -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   </body>
</html>
