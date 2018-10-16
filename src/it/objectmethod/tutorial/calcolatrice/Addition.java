package it.objectmethod.tutorial.calcolatrice;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addition extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     // reading the user input
				try {
					double n1 = Double.parseDouble(request.getParameter("number1"));
			        double n2 = Double.parseDouble(request.getParameter("number2"));
					double result = n1 + n2;				
			        request.setAttribute("result", result);
			        request.getRequestDispatcher("GUI.jsp").forward(request, response);
				}
				catch(NumberFormatException e)
				{
					String error = "String to Number";
					request.setAttribute("result", error);
			        request.getRequestDispatcher("GUI.jsp").forward(request, response);
					e.printStackTrace();
				}   
				catch(Exception e)
				{
					String error = "Error";
					request.setAttribute("result", error);
			        request.getRequestDispatcher("GUI.jsp").forward(request, response);
					e.printStackTrace();
				} 
}
	}