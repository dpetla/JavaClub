/*
 * Course: PROG32758 (Java Enterprise)
 * Assignment: 3
 * Student: Douglas Petla
 * Student ID: 991413692
 */
package javaclub;

import ejd.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.mindrot.jbcrypt.BCrypt;

/**
 * Model component of JavaClub application.
 * @author dpetla
 */
public class UserDatabase
{
    // constants
    private static final String DB_URL = "jdbc:mysql://localhost:3306/ejd";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "991413692";
    
    // instance vars
    JdbcHelper jdbc;
    
    // ctors
    public UserDatabase()
    {
        jdbc = new JdbcHelper();
    }
    
    // get a user from DB using its id
    // if found return User object, otherwise retun null
    public User getUser(String id)
    {
        // validete input
        if(id == null || id.isEmpty())
            return null;
        
        // prepared sql statement
        String sql = "SELECT * FROM jcUser WHERE ID = ?";
        
        // set params
        ArrayList<Object> params = new ArrayList<>();
        params.add(id);
        
        // return type with default value
        User user = null;
        jdbc.connect(DB_URL, DB_USER, DB_PASS);
        try
        {
            // execute query
            ResultSet rs = jdbc.query(sql, params);
            
            // get user data
            if (rs.first())
            {
                // found
                user = new User(rs.getString("id"), 
                                rs.getString("password"),
                                rs.getString("firstName"), 
                                rs.getString("lastName"), 
                                rs.getString("email"));
             
            }
            
        }catch(SQLException e)
        {
            // print message
            System.err.println(e.getSQLState() + ": " + e.getMessage());
            
        }catch(Exception e)
        {
            // print messge
            e.printStackTrace();
        }
        jdbc.disconnect();
        
        return user;
    }
    
    
    // add user to DB
    // if success, return 1, otherwise retutns -1
    public int addUser(String id, String pw, String fn, String ln, String email)
    {
        // check if the user is already in the DB
        if(!isUnique(id))
            return -1;
        
        // hash the password
        String hashedPassword = BCrypt.hashpw(pw, BCrypt.gensalt());
        
        // set SQL String 
        String sql = "INSERT INTO jcUser VALUES (?, ?, ?, ?, ?)";
        
        // set params
        ArrayList<Object> params = new ArrayList<>();
        params.add(id);
        params.add(hashedPassword);
        params.add(fn);
        params.add(ln);
        params.add(email);
        
        jdbc.connect(DB_URL, DB_USER, DB_PASS);
        int result = jdbc.update(sql, params);
        jdbc.disconnect();
        
        return result;
    }
    
    
    
    // check user id if it is unique
    // return true if it is NOT in the DB
    public boolean isUnique(String id)
    {
        return (getUser(id) == null);
    }
    
    
    // validate password
    public boolean isValid(String id, String pw)
    {
        // get user from DB
        User user = getUser(id);
        
        // checks if user exists
        if (user == null)
            return false;
        else
            //checks if password is valid
            return BCrypt.checkpw(pw, user.getPassword());
    }
    
}
