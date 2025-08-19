package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myemail = req.getParameter("email");
		String mypass = req.getParameter("pass");
		
		PrintWriter out = resp.getWriter();
		
		if(myemail != null && mypass != null &&
		myemail.equals("deepak@gmail.com") && mypass.equals("deepak123")) {
			
			req.setAttribute("name_key", "Deepak Panwar");
			
			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, resp);
			
		}else {
			resp.setContentType("text/html");
			out.print("<h3 style='color: red'> Email id and password didnt match <h3/>");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
	}

}
