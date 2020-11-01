package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Electric
 */
@WebServlet("/Electric")
public class Electric extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String p = request.getParameter("pc");
		if(p!= null) {
			Cookie cookie = new Cookie("item1", p);
			response.addCookie(cookie);
		}
		String t = request.getParameter("tv");
		if(t!=null) {
			Cookie cookie = new Cookie("item2", t);
			response.addCookie(cookie);
		}
		
		response.setContentType("text/html");
		PrintWriter out  = response.getWriter();
		out.print("<html>");
		out.print("<head>Electric");
		out.print("<title>Electric:Page</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<form action ='HomeAppliances'>");
		out.print("<input type='checkbox' value='mixer' name='mixer'>Mixer<br>");
		out.print("<input type='checkbox' value='cooler' name='cooler'>Cooler<br>");
		out.print("<input type='submit' value='Next' name='next'><br>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
	}

}
