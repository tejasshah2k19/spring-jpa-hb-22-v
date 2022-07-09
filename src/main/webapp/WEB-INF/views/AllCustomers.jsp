<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ALL Customers</title>
</head>
<body>
	<h2>All Customers</h2>


	<table border="1">
		<tr>
			<td>FirstName</td>
			<td>Action</td>

		</tr>

		<c:forEach items="${customers}" var="c">
			<tr>
				<td>${c.firstName }</td>
				<td>${c.orders.size() }   <a href="vieworders?customerId=${c.customerId}">View Order</a></td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>