<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="s" class="jsptestproject.Student" scope="session"></jsp:useBean>
	<jsp:setProperty property="id" name="s" value="1" />
	<jsp:setProperty property="name" name="s" value="John" />
	<a href="jspusebeantest1.jsp">Go</a>
</body>
</html>