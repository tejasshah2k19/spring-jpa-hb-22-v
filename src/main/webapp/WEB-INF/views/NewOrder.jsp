<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Order</title>
</head>
<body>
	<h2>New Order</h2>
	<form action="saveorder" method="post">

		Customer: <select name="customer.customerId">
			<option>Select customer</option>

			<c:forEach items="${customers}" var="c">
				<option value="${c.customerId}">${c.firstName}</option>
			</c:forEach>
		</select> Total Amount : <input type="text" name="totalAmount"><Br>
		<Br> <input type="submit" value="Save Order" />


	</form>
</body>
</html>