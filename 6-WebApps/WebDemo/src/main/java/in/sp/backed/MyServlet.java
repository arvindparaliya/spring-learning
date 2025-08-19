package in.sp.backed;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/submitForm")
public class MyServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String myname = req.getParameter("name");
		String myemail = req.getParameter("email");
		
		System.out.println("Name1 : " + myname);
		System.out.println("Emial1 : " + myemail);
		
		PrintWriter out = resp.getWriter();
		out.println("Name : " + myname);
		out.println("Email : " + myemail);
	}

}
