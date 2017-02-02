# Java Club
The purpose of this assignment is to construct a skeletal structure of a login-based web application using MVC, Servlet, JSP with EL, JSTL and JavaBean.

## Description
* Practice the creation of an online social network club, “Java Club” to share programming knowledge and job opportunities among members.
* Home page to allow to login to the member’s main page, or to go to registration form page to sign up “Java Club”.
* When a user registers the signup form successfully, the user’s information will be stored in database.
* When a registered member logins successfully, the user is redirected to the member’s main page.
* Main page shows a greeting message, the member’s profile and a logout link.

## File this project contains:
1. javaClub.sql : all SQL statements used for this assignment.
2. index.html : home page of “Java Club”.
3. Register.java : servlet (Controller) for the registration form page.
4. register.jsp : JSP (View) for the registration form page.
5. Login.java : servlet (Controller) to allow user to login.
6. login.jsp : JSP (View) to allow user to login.
7. MainPage.java : servlet (Controller) to render the member’s main page.
8. mainPage.jsp : JSP (View) to render the member’s main page.
9. logout.jsp : JSP (View) to allow user to logout.
10. registerResult.jsp : JSP (View) to notify user when the signup is completed (success / fail). 
11. User.java : JavaBean class (Model) to define user information.
12. UserDatabase.java : class to interact with User table in database. (Model)

## Java Club Diagram
![alt text](https://github.com/dpetla/JavaClub/blob/master/JavaClubDiagram.jpg)
