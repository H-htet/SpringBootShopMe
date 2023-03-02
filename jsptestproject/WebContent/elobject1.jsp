<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="ss" class="jsptestproject.Student" scope="application"></jsp:useBean>
	<jsp:setProperty property="id" name="ss" value="1"/>
	<jsp:setProperty property="name" name="ss" value="David"/>
	<a href="elobject2.jsp">Go</a>
</body>
</html>