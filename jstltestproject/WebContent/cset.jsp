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
<c:set var="a" value="Ace Inspiration" scope="session"/>
<c:out value="${a}"></c:out>
<c:remove var="a"/>
<c:out value="${a}"></c:out>
</body>
</html>