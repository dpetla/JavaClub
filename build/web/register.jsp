<!--
Course: PROG32758 (Java Enterprise)
Assignment: 3
Student: Douglas Petla
-->
<%-- 
    Document   : register
    Created on : Aug 10, 2016, 5:39:26 PM
    Author     : dpetla
--%>

<%@ page contentType="text/html" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="main.css" rel="stylesheet" type="text/css"/>
        <title>Java Club Registration Form</title>
    </head>
    <body>
        <div class="container center-container" id="register">
            <header class="jumbotron">
                <h1>Java Club</h1>
                <p>Write Once, Run Anywhere</p>
            </header>
            <h2>Java Club Registration Form</h1>
            <p>Please fill out the form below ...</p>

            <c:if test="${not empty signupMessage}">
                <div class="alert alert-danger" role="alert">
                    <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
                    <span class="sr-only">Error:</span> ${signupMessage}
                </div>
            </c:if>

            <form name="registration" action="Register" method="post" style="padding: 20px;">
                <div class="form-group row">
                    <label for="user" class="col-2 col-form-label">user ID</label>
                    <div class="col-10">
                        <input type="text" name="user" class="form-control">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="pass1" class="col-2 col-form-label">Password</label>
                    <div class="col-10">
                        <input type="password" name="pass1" class="form-control">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="pass2" class="col-2 col-form-label">Re-enter password</label>
                    <div class="col-10">
                        <input type="password" name="pass2" class="form-control">
                    </div>
                </div>
                <div class='form-group row'>
                    <label for="firstName" class="col-2 col-form-label">First name</label>
                    <div class="col-10">
                        <input type="text" name="firstName" class="form-control">
                    </div>
                </div>
                <div class='form-group row'>
                    <label for="lastName" class="col-2 col-form-label">Last name</label>
                    <div class="col-10">
                        <input type="text" name="lastName" class="form-control">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="email" class="col-2 col-form-label">Email</label>
                    <div class="col-10">
                        <input type="email" name="email" class="form-control">
                    </div>
                    <small id="emailHelp" class="form-text text-muted">
                        Don't worry, we will not share your email with anyone.
                    </small>
                </div>
                <input type="submit" value="Signup" class="btn btn-md-primary btn-block" 
                       style="margin-bottom: 50px;">
            </form>
        </div>
        <!-- scripts -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
       
</body>
</html>
