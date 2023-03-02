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
	<c:forTokens var="i" items="Ace Inspiration Training Center" delims=" ">
		<c:out value="${i}"></c:out><br>
	</c:forTokens>
</body>
</html>