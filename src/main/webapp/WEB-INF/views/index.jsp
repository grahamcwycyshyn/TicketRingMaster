<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Insert title here</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<link href="/temp.css" rel="stylesheet" />
<link href="/style.css" rel="stylesheet" />
</head>
<body class="simplex">

	<div class="container">
			<form action="/" method="get">
			<span>Search by Keyword: 
				<input type="text" name="keyword">
			</span>
			<span>Search by City:
				<input type="text" name="city">
			<span>Search by Date:
				<input type="date" id="date" name="startDateTime">
				<p>
			<button type="submit">Submit</button>
			</p>
		<h1>Events</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Event</th>
					<th>City</th>
					<th>Date</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="event" items="${list}">
					<tr>
						
						<td><a href="${event.url}" target="_blank">${event.name}</a></td>
						
						<td>${event.city}</td>
						<td>${event.date}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</form>
	</div>
</body>
</html>