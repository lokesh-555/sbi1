package webapp;

import java.io.IOException;
import javax.servlet.ServletException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NewPassword")
public class Newpassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String newPassword=request.getParameter("newpassword");
		String confirmPassword=request.getParameter("confirm-password");
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
	
		if("email".equals(email) && "password".equals(newPassword)&& "password".equals(confirmPassword))
		{
			System.out.println("create password");
		}
		else
		{
			System.out.println("sign out");
		}
	}
}