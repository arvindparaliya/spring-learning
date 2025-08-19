package in.ap.main;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submitForm")
public class MyServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	      //override the service method
	     //it's allow the full control over request handling. means it doesn't directly called doGet(), doPost(), etc method
	     //we must manually check the request type( GET, POST,etc.) inside service() and handle it yourself.
		
	    String mysearch = req.getParameter("search1");
		resp.sendRedirect("https://www.google.com/search?q=" + mysearch);
		
	}
}
