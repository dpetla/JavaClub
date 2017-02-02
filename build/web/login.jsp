<!--
Course: PROG32758 (Java Enterprise)
Assignment: 3
Student: Douglas Petla
-->
<%-- 
    Document   : login
    Created on : Aug 1, 2016, 11:31:26 PM
    Author     : dpetla
--%>

<%@ page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="main.css" rel="stylesheet" type="text/css"/>
        <title>Login Page</title>
    </head>
    <body>
        <div class="container center-container" id="login">
            <header class="jumbotron">
                <h1>Java Club</h1>
                <p>Write Once, Run Anywhere</p>
            </header>
            <div class="alert alert-danger" role="alert">
            <strong>Oh snap!</strong> ${loginMessage}
            </div>
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h2 class="panel-title">Please sign in</h2>
                </div>
                <div class="panel-body">
                    <form name="login_form" method="post" action="Login" class="form-signin">
                        <label for="inputUser" class="sr-only">User ID</label>
                        <input type="text" id="inputUser" name="user" class="form-control" placeholder="User ID" required autofocus>
                        <label for="inputPassword" class="sr-only">Password</label>
                        <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
                        <button class="btn btn-md btn-primary btn-block" type="submit" value="Login">Sign in</button>
                        <br>
                        <p>Not registered yet? <a href="Register">Sign up here.</a></p>
                    </form>
                </div>
            </div>
        </div>
        <!-- scripts -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    </body>
</html>
