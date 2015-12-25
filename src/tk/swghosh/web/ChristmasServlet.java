package tk.swghosh.web;

import tk.swghosh.model.ChristmasRender;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ChristmasServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String answer = ChristmasRender.getQuote();
		request.setAttribute("message",answer);
		RequestDispatcher view = request.getRequestDispatcher("christmas.jsp");
		view.forward(request, response);
	}
}