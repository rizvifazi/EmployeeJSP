<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee JSP</title>
</head>
<body>

<!--  
	<c:forEach items="${object}" var="element">
		<tr>
			<td>${element.getId}</td>
			<td>${element.getName}</td>
			<td>${element.getAge}</td>
			<td>${element.getDepartment}</td>
			<td>${element.getSalary}</td>
		</tr>
	</c:forEach>-->
	<h2>${object}</h2>

</body>
</html>