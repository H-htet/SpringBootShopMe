<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="showAll.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="loginServlet" method="post">
	<table>
		<tr><td>Email</td><td><input type="text" name="login_email" /></td></tr>
		<tr><td>Password</td><td><input type="password" name="login_passw" /></td></tr>
		<tr><td></td><td><input type="submit" value="Login">&nbsp;&nbsp;<input type="submit" value="Register"></td></tr>
	</table>	
</form>
</body>
</html>