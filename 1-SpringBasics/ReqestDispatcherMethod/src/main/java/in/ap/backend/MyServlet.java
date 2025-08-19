package in.ap.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class MyServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter(); //for Writing text in web page
		
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		
		
		
		if(myemail.equals("ram@gmail.com") && mypass.equals("ram123")) {
			
			req.setAttribute("name_key", "Ram Pandiya");
			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, resp);                     //just forward the request into URL
		}
		else {
			resp.setContentType("text/html");          //for type of content we want to print in web-page
			out.print("<h3 style='color : red'>Email id and password didn't match! </h3/>");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.include(req, resp);                     //include response with some message
		}
		
	}
}