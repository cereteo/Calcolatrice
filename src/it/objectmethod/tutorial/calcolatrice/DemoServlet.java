package it.objectmethod.tutorial.calcolatrice;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     // reading the user input
			String operation = request.getParameter("ope");
			
			switch (operation) {
			case "+":
				request.getRequestDispatcher("Addition").forward(request, response);
				break;
				
			case "-":
				request.getRequestDispatcher("Subtraction").forward(request, response);
				break;
				
			case "*":
				request.getRequestDispatcher("Moltiplication").forward(request, response);
				break;
				
			case "/":
				request.getRequestDispatcher("Division").forward(request, response);
				break;

			default:
				break;
			}
        }
}