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
	<c:set var="mark" value="85"></c:set>
	<c:choose>
		<c:when test="${mark>80}">
			<c:out value="Grade-A"></c:out>
		</c:when>
		<c:when test="${mark>60}">
			<c:out value="Grade-B"></c:out>
		</c:when>
		<c:when test="${mark>40}">
			<c:out value="Grade-C"></c:out>
		</c:when>
		<c:otherwise>
			<c:out value="Grade-D"></c:out>
		</c:otherwise>
	</c:choose>
</body>
</html>