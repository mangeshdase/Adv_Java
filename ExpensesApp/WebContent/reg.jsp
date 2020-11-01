
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
	String uname = request.getParameter("userName");
	String upass = request.getParameter("userPass");
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/expenses","root","root");
	PreparedStatement ps = con.prepareStatement("insert into user(user_name,user_pass)values(?,?)");
	ps.setString(1,uname);
	ps.setString(2,upass);
	int i = ps.executeUpdate();
	con.close();
	response.sendRedirect("login.jsp");
%>