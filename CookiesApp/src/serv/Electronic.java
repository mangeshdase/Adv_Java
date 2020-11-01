package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Electronic
 */
@WebServlet("/Electronic")
public class Electronic extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out  = response.getWriter();
		out.print("<html>");
		out.print("<head>Electronic");
		out.print("<title>Electronic:Page</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<form action ='Electric'>");
		out.print("<input type='checkbox' value='tv' name='tv'>TV<br>");
		out.print("<input type='checkbox' value='pc' name='pc'>PC<br>");
		out.print("<input type='submit' value='Next' name='next'><br>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
	}

}
