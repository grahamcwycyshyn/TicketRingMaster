<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<link href="/temp.css" rel="stylesheet" /> 
<link href="/style.css" rel="stylesheet" />
</head>
<body class="simplex">
<div class="container">
<div class = "form-inline form-group mb-2">
<label for="search-input" class="sr-only">Filter</label>

<input type="text" class="form-control" id="search-input" placeholder="Filter">
</div>
	
		<h1>Events</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Product</th><th>City</th><th>Date</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="event" items="${list}">
				<tr>
					<td>${event.name}</td>
					<td>${event.city}</td>
					<td>${event.date}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<a href="/register" class="btn btn-secondary">Register</a>
		<a href = "/login" class = "btn btn-secondary">Login</a>
		<a href = "/logout" class = "btn btn-secondary">Logout</a>
		<a href="/admin" class="btn btn-secondary">Admin</a>
	
	</div>
</body>
</html>