<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add_passenger_Details</title>
</head>
<body>
<h2>Flight Details</h2>
<pre>
Flight No: ${flight.id}
Departure City: ${flight.departureCity}
Arrival City: ${flight.arrivalCity}
Departure Time: ${flight.estimatedDepartureTime}
Operating Airline: ${flight.operatingAirline}
</pre>
<h2>Fill Passenger Details</h2>

<form action="/bookingDetails" method="post">


 <pre>

First Name<input type="text" name="firstName"/>
Middle Name<input type="text" name="middleName"/>
Last Name<input type="text" name="lastName"/>
Email<input type="text" name="email"/>
Mobile No.<input type="text" name="phone"/>
<input type="hidden" name="flightId" value="${flight.id}" />
</pre>

<h2>Enter your card details here..</h2>

<pre>

Enter card No. <input type="text" name="cardNo"/>
Enter name on the card <input type="text" name="nameOnCard"/>
Enter CVV <input type="password" name="cvv"/>
Enter expire date <input type="text" name="expireDate"/>

</pre>





<input type="submit" value="Complete Booking"/>
</form>






</body>
</html>