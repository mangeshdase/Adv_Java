<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Page</title>
</head>
<body>
<form action="add.jsp" method="post"> 
	<table align="center">
		<thead>
			<tr>
				<th colspan="2">Add Expenses</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Item Name:</td>
				<td><input type="text" name="item"/></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><input type="text" name="price"/></td>
				</tr>
				<tr>
					<td>Purchase Date</td>
					<td><input type="text" name="pdate"/></td>
					</tr>
		</tbody>
		<tfoot>
			<tr>
				<th><a href="home.jsp">Back</a></th>
				<th><input type="submit" value="Add"/></th>
			
			</tr>
		</tfoot>
	</table>
</form>

</body>
</html>