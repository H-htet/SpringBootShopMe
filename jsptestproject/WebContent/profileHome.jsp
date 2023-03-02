<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="sesuser" class="jsptestproject.ProfileRegisterBean" scope="session"></jsp:useBean>	
	
	<%@ include file="showAll.jsp" %>
	
	<div style="margin-top:20px;">
		<table border="1" style="border:1px solid #000; border-spacing:1px; border-collapse:collapse;">
			<tr>
				<th>Label</th>
				<th>with EL value</th>
				<th>with jsp:useBean value</th>
			</tr>
			<tr>
				<td>Name</td>
				<td>${sessionScope.sesuser.name }</td>
				<td><jsp:getProperty property="name" name="sesuser"/></td>
				<!-- td>${sessionScope.sesuser.name }</td-->
			</tr>
			<tr>
				<td>Email</td>
				<td>${sessionScope.sesuser.email }</td>
				<td><jsp:getProperty property="email" name="sesuser"/></td> 
				<!-- td>${sessionScope.sesuser.email }</td-->
			</tr>
			<tr>
				<td>Gender</td>
				<td>${sessionScope.sesuser.gender }</td>
				<td><jsp:getProperty property="gender" name="sesuser"/></td>
			</tr>
		</table>
	</div>
</body>
</html>