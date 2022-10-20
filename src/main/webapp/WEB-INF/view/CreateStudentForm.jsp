<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
<title>Create Student Registration</title>
</head>
<body>
<div class="container">
<h3> Create Student Registration</h3>
<hr>
<form action="saveRegistration" method="post"> 
<input type="hidden" name="studentid" placeholder="Student Id" value="${student.studentid}" class="form-control mb-4 col-4"></input>
<input type="text" name="name" placeholder="name" class="form-control mb-4 col-4" value="${student.name}" ></input>
<input type="text" name="department" placeholder="department"  class="form-control mb-4 col-4" value="${student.department}"></input>
<input type="text" name="country" placeholder="country" class="form-control mb-4 col-4" value="${student.country}" ></input>
<input type="hidden" name="action" value="${action}"></input>
 <div>
<input type="submit"></input>
</form>
</div>
</div>
</body>
</html>