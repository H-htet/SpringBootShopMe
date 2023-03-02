<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:url var="myURL" value="index.html">
		<c:param name="id" value="12"></c:param>
		<c:param name="name" value="AI"></c:param>
	</c:url>
	<a href="${myURL }">Go</a>
</body>
</html>