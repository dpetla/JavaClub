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
import javax.servlet.http.HttpSession;

/**
 *
 * @author dpetla
 */
@WebServlet("/Login")
public class Login extends HttpServlet
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
        // get params from index.html form
        String userId = request.getParameter("user");
        String pass = request.getParameter("password");

        // validate parameters
        UserDatabase db = new UserDatabase();

        if (db.isValid(userId, pass))
        {
            // create a session, if it does not exist, and set attributes
            HttpSession session = request.getSession(true);
            User user = db.getUser(userId);
            session.setAttribute("user", user);

            // redirect to MainPage Servlet
            response.sendRedirect("MainPage");
            
        } else
        {
            // set a request attribute "loginMessage"
            request.setAttribute("loginMessage", "You entered the wrong user ID or password.");
            
            // forward to login.jsp to try login again
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.forward(request, response);
        }

    }

}
