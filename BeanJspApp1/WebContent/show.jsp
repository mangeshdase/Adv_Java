<%@page import="dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <jsp:useBean id="student" class="dto.Student" scope="session" ></jsp:useBean>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:getProperty property="rno" name="student"/><br>
	<jsp:getProperty property="studentName" name="student"/><br>
	<jsp:getProperty property="fee" name="student"/><br>
	<jsp:getProperty property="course" name="student"/><br>
</body>
</html>