package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String gender=request.getParameter("gender");
		

        System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Gender: " + gender);
        response.setContentType("text/html");
		PrintWriter out=response.getWriter();
 if("fname".equals(fname)&& "lname".equals(lname) && "email".equals(email) 
		 && "password".contentEquals(password)&& "gender".contentEquals(gender))
		{
			System.out.println("register sucessful");
		}
			else
			{
				System.out.println("sign out");
			}
		}
}

