<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight_details</title>
</head>
<body>
<h2>All available flights</h2>

<table border=5>
<tr>
<th>Flight No</th>
<th>Departure City</th>
<th>Arrival City</th>
<th>Departure Time</th>
<th>Operating Airline</th>
<th>Select Flight</th>
</tr>

<c:forEach items="${flights}" var="flights">
<tr>
<td>${flights.id}</td>
<td>${flights.departureCity}</td>
<td>${flights.arrivalCity}</td>
<td>${flights.estimatedDepartureTime}</td>
<td>${flights.operatingAirline}</td>
<td><a href="/addPassenger?flightId=${flights.id}">Select</a></td>
</tr>




</c:forEach>






</table>


</body>
</html>