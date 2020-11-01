<%@page import="dto.Student"%>
<jsp:useBean id="student" class="dto.Student" scope="session" ></jsp:useBean>
<jsp:setProperty property="rno" name="student" param="rollNo"/>
<jsp:setProperty property="studentName" name="student" param="name"/>
<jsp:setProperty property="fee" name="student" param="fee"/>
<jsp:setProperty property="course" name="student" param="crs"/>
<%
	response.sendRedirect("show.jsp");
%>