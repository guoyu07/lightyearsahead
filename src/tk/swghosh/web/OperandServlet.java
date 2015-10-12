package tk.swghosh.web;

import tk.swghosh.model.OperandRender;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class OperandServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		String uagent=request.getHeader("user-agent");
		String[] answer=OperandRender.getContext(uagent);//Get message from Model
		//response.setContentType("text/html");
		//PrintWriter out=response.getWriter();
		//out.println(answer[0]+"<br/>"+answer[1]);
		request.setAttribute("message",answer);
		RequestDispatcher view=request.getRequestDispatcher("operand.jsp");
		view.forward(request,response);
	}
}