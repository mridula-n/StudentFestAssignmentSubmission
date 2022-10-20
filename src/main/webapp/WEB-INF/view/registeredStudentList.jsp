<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Registrations</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
	
<div  style="margin-top: 20px ; margin-left: 20px">	
<div><input type="search" placeholder="name" class="form-control-sm ml-5 mr-2 mb-3" ></input>
<button class="btn btn-primary btn-sm mb-3">Search</button>
<a href="/StudentAssignment/registerNewStudent?action=R&studentId=1" class="btn btn-primary btn-sm mb-3">Add</a>
</div>
</head>
<body>
<h1> List Of Registration  </h1>
<table class="table">
<thead class="thead-dark">
<tr>
<td scope="col">
Student Id
</td>
<td scope="col">
Student Name
</td>
<td>
Country
</td>
<td>
Department
</td>
<td>
Action
</td>
</tr>
</thead>
<tbody>
<c:forEach items="${viewStudents}" var="templist">
<tr >
<td><c:out value="${templist.studentid}"></c:out></td>
<td><c:out value="${templist.name}"></c:out></td>
<td><c:out value="${templist.country}"></c:out></td>
<td><c:out value="${templist.department}"></c:out>
<td>
<a class="btn btn-info btn-sm" href="/StudentAssignment/registerNewStudent?action=U&studentId=${templist.studentid}">
 Update
</a>
<a class="btn btn-info btn-sm" href="/StudentAssignment/DeleteStudent?studentid=${templist.studentid}" >
Delete 
</a>
</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
</body>
</html>