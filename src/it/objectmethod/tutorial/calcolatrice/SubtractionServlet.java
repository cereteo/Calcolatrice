package it.objectmethod.tutorial.calcolatrice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SubtractionServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// reading the user input
		String error = null;
		double result = 0d;
		try {
			double n1 = Double.parseDouble(request.getParameter("number1"));
			double n2 = Double.parseDouble(request.getParameter("number2"));

			result = n1 - n2;	 
		}
		catch(NumberFormatException e)
		{
			error = "String to Number";
			e.printStackTrace();
		}   
		catch(Exception e)
		{
			error = "Error";
			e.printStackTrace();
		} 

		request.setAttribute("result", error == null? result:error);
		request.getRequestDispatcher("GUI.jsp").forward(request, response);
	}
}