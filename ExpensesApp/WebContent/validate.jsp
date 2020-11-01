
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%
	String uname = request.getParameter("userName");
	String upass = request.getParameter("userPass");
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/expenses", "root","root");
	PreparedStatement ps = con.prepareStatement("select * from user where user_name=? and user_pass=?");
	ps.setString(1, uname);
	ps.setString(2, upass);
	ResultSet rs = ps.executeQuery();
	if(rs.next()){
		int uid = rs.getInt("user_id");
		session.setAttribute("cur_user_id", uid);
		response.sendRedirect("home.jsp");
	}
	else{
		response.sendRedirect("login.jsp");
	}
	con.close();
%>