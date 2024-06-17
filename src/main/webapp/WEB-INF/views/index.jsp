<%@page import="java.util.List"%>
<%@page import="com.pack.EmployeeJSP.EmployeeConfig"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Age</th>
				<th>Department</th>
				<th>Salary</th>
			</tr>
		</thead>
		<tbody>
			<%
                List<EmployeeConfig> list = (List<EmployeeConfig>) request.getAttribute("object");
                if (list != null) {
                    for (EmployeeConfig employee : list) {
            %>
			<tr>
				<td><%= employee.getId() %></td>
				<td><%= employee.getName() %></td>
				<td><%= employee.getAge() %></td>
				<td><%= employee.getDepartment() %></td>
				<td><%= employee.getSalary() %></td>
			</tr>
			<%
                    }
                } else {
            %>
			<tr>
				<td colspan="5">No data available</td>
			</tr>
			<%
                }
            %>
		</tbody>
	</table>
</body>
</html>
