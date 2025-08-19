package in.ap.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

import in.ap.dbcon.DbConnection;
import in.ap.model.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginForm")
public class Login extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        String myemail = req.getParameter("email1");
        String mypass = req.getParameter("pass1");

        try {
        	
            Connection con = DbConnection.getConnection();

            String select_sql_query = "SELECT * FROM register WHERE email=? AND password=? ";
            PreparedStatement ps = con.prepareStatement(select_sql_query);

            ps.setString(1, myemail);
            ps.setString(2, mypass);

            ResultSet rs =ps.executeQuery();
            if (rs.next()) 
            {	
            	
            	User user = new User();
            	user.setName(rs.getString("name"));
            	user.setEmail(rs.getString("email"));
            	user.setCity(rs.getString("city"));
            	
            	HttpSession session = req.getSession();
            	session.setAttribute("session_user", user);
            	
            	out.println("<h4 style='color: green;'>User Login Successful!</h4>");
            	RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
            	rd.include(req, resp);  
            } 
            else 
            {
                out.println("<h4 style='color: red;'>Email id and pasword didn't match !</h4>");
                RequestDispatcher rd = req.getRequestDispatcher("/login.html");
                rd.include(req, resp);
            }

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            out.println("<h4 style='color: red;'>An error occurred: " + e.getMessage() + "</h4>");
        }
    }
}
