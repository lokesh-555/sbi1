package webapp;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DashBoard")
public class DashBoard extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		 PrintWriter out = response.getWriter();

		String city=request.getParameter("city");
		String state=request.getParameter("state");
		String country=request.getParameter("country");

		String qualification =request.getParameter("qualification");
		String passoutyear=request.getParameter("passoutyear");
		String percantage=request.getParameter("percantage");

	    String fathername=request.getParameter("fathername");
	    String mothername=request.getParameter("mothername");
	    String siblings=request.getParameter("siblings");
	    
 if("city".equals(city) && "state".equals(state) && "country".equals(country) && "qualification".equals(qualification) && "passoutyear".equals(passoutyear)
		 && "percentage".equals(percantage) &&"fathername".equals(fathername)
		 && "mothername".equals(mothername) && "siblings".equals(siblings))	
 {
	System.out.println("enter the details");
 }
	else
	{
		System.out.println("submit");
	}
}
}
	