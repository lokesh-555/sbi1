package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
               
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		if(email.equals(email)&& password.equals(password))
		{
			System.out.println("signuot");
		}
			else
			{
				System.out.println("invalid");
			}
		}
}
