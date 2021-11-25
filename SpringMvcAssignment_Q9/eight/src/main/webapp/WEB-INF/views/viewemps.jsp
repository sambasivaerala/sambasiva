<%@page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>View Employee</title>
	</head>

	<body>
		<h1>Employees List</h1> 
	    	 	    	
	    <table border="2">
	    	<thead> <tr> 
	    	 	<th>Id</th><th>Name</th><th>Salary</th>
			</tr> </thead>
			<tbody>
				<c:forEach var="emp" items="${list}" >
					<tr>
						<td>${emp.id}</td><td>${emp.name}</td><td>${emp.salary}</td> 
				    </tr>
				 </c:forEach>
			 </tbody>
	    </table>
		<br>
		<a href="/eight/viewemp/1">1</a>
	    <a href="/eight/viewemp/2">2</a>
		<a href="/eight/viewemp/3">3</a>	
	</body>
</html>