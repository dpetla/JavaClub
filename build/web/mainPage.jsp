<!--
Course: PROG32758 (Java Enterprise)
Assignment: 3
Student: Douglas Petla
-->
<%-- 
    Document   : mainPage
    Created on : Aug 10, 2016, 5:53:36 PM
    Author     : dpetla
--%>

<%@ page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="main.css" rel="stylesheet" type="text/css"/>
        <title>Main Page</title>
    </head>
    <body id='main-page'>
        <div class="container center-container">
            <header class="jumbotron">
                <h1>Java Club</h1>
                <p>Write Once, Run Anywhere</p>
            </header>
            <div class="panel panel-danger">
                <div class="panel-heading">
                  <h3 class="panel-title">Member Restricted Area</h3>
                </div>
                <div class="panel-body">
                    <h3 class="panel-title">Hello ${user.id}, you have successfully logged in to Java Club</h3>
                    <h4><strong>Your Profile:</strong></h4>
                    <p class="lead">Name: ${user.firstName} ${user.lastName}</p>
                    <p class="lead">Email: <a href="mailto:${user.email}">${user.email}</p>
                </div>
              </div>
            <a href="logout.jsp" class="btn btn-outline-danger" role="button">
                <span class="glyphicon glyphicon-log-out" aria-hidden="true"></span>
                Log out</a>
        </div>
        <!-- scripts -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </body>
</html>
