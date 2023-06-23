<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>serach_flights</title>
</head>
<body>
<h2>Search Flights</h2>
${blank}

<form action="/searchFlight" method="post">

From<input type="text" name="from"/> 
To<input type="text" name="to"/> 
Departure Date<input type="text" name="date"/> 
<input type="submit" name="Search Flight"/> 


</form>

</body>
</html>