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
<c:catch var="catchException">
	<% int i=2/0;%>
</c:catch>
<c:if test="${catchException!=null }">
	<c:out value="${catchException.message }"></c:out>
	<c:out value="Can't divided by Zero"></c:out>
</c:if>
</body>
</html>