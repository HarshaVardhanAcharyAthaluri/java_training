<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*" %>    
<%@page import="com.usermanagment.dto.UserDto" %>

<!DOCTYPE html>
<html>
<head>
<style>
table,tr,th,td {
	border: solid 1px;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>User Details</h1>

<table>
<tr>
<th>UID</th>
<th>USERNAME</th>
<th>ADDR</th>
<th>CONTACT</th>
</tr>

<% 
List<UserDto> userlist = (ArrayList)request.getAttribute("userlist");
for(int i=0;i<userlist.size();i++){%>
	<tr>
	<td><%= userlist.get(i).getUid() %></td>
	<td><%=  userlist.get(i).getUsername() %></td>
	<td><%= userlist.get(i).getAddr()  %></td>
	<td><%= userlist.get(i).getContact() %></td>
	</tr>
<%
}
%>

</table>




</center>

</body>
</html>