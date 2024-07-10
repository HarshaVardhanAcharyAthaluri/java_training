<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	<center>
		<form method="post" action="/usermanagment/save">
			UID <input type="text" name="uid"> </br> 
			USERNAME<input type="text" name="username"></br> 
			PASSWORD<input type="password" name="password"></br>
			ADDRESS<input type="text" name="addr"></br>
			CONTACT<input type="text" name="contact"></br> 
			<input type="submit" value="SAVE">
		</form>
	</center>
</body>
</html>