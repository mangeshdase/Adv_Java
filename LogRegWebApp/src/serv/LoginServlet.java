package serv;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.Resultset;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("userName");
		String upass = request.getParameter("userPass");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/cdac","root","root");
			PreparedStatement ps =con.prepareStatement("select * from user where user_name=? and user_pass=?");
			ps.setString(1,uname);
			ps.setString(2,upass);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				response.sendRedirect("home.html");
			}else {
				response.sendRedirect("login.html");
			}
			con.close();
			
			}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
