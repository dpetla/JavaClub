/*
 * Course: PROG32758 (Java Enterprise)
 * Assignment: 3
 * Student: Douglas Petla
 * Student ID: 991413692
 */
package javaclub;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dpetla
 */
@WebServlet("/Register")
public class Register extends HttpServlet
{

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        doPost(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        // create request dispatcher
        RequestDispatcher rd = null;

        // get 6 input parameters from request
        String userId = request.getParameter("user");
        String pass1 = request.getParameter("pass1");
        String pass2 = request.getParameter("pass2");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");

        // if all inputs are null, then it is the first request
        if (userId == null && pass1 == null && pass2 == null
                && firstName == null && lastName == null && email == null)
        {
            // simply forward to register.jsp and exit this method
            rd = request.getRequestDispatcher("register.jsp");
            rd.forward(request, response);

        }

        // instance of UserDatabase to access DB
        UserDatabase db = new UserDatabase();

        // request attribute to store the current status (error/result)
        String signupMessage = null;

        // subsequent request, validate all input parameters
        if (userId == null || userId.isEmpty()) {
            signupMessage = "User ID cannot be empty.";
        } else if (!db.isUnique(userId)) {
            signupMessage = "User ID, " + userId + " already exists.";
        } else if (!pass1.equals(pass2)) {
            signupMessage = "Passwords don't match.";
        } else if (firstName == null || firstName.isEmpty()) {
            signupMessage = "First Name cannot be empty.";
        } else if (lastName == null || lastName.isEmpty()) {
            signupMessage = "Last Name cannot be empty.";
        } else if (email == null || email.isEmpty()) {
            signupMessage = "email cannot be empty.";
        }

        // passed validation, forward to registerResult.jsp
        if (signupMessage == null)
        {
            // add the user to DB and check its is successful
            int check = db.addUser(userId, pass1, firstName, lastName, email);

            //update signupMessage and set as request attribute
            if (check == 1)
            {
                signupMessage = "Sign up successfully. Thank you for joining JavaClub";

                // set path
                rd = request.getRequestDispatcher("registerResult.jsp");
            } else
            {
                signupMessage = "Try again...";
                
                // set path
                rd = request.getRequestDispatcher("register.jsp");
            }

            request.setAttribute("signupMessage", signupMessage);
            
            // forward
            rd.forward(request, response);

        } else
        {
            // set as request attribute
            request.setAttribute("signupMessage", signupMessage);

            // forward
            rd = request.getRequestDispatcher("register.jsp");
            rd.forward(request, response);
        }

    }

}
