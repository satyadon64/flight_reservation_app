<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log_in_page</title>
</head>
<body>
<h2>Log In here...</h2>
${error}
<form action="/verifyLogin" method="post">

Email <input type="text" name="email"/>
Password <input type="password" name="password"/>
<input type="submit" name="Log In" />



</form>


</body>
</html>