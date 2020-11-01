package serv;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("userName");
		String upass = request.getParameter("userPass");
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/cdac","root","root");
		PreparedStatement ps =con.prepareStatement("insert into user values(?,?)");
		ps.setString(1,uname);
		ps.setString(2,upass);
		int i = ps.executeUpdate();
		con.close();
		
		response.sendRedirect("login.html");
		}catch (ClassNotFoundException e) {
		e.printStackTrace();
	}catch (SQLException e) {
		e.printStackTrace();
	}
	}

}