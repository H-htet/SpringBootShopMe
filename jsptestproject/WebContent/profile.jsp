<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="auser" class="jsptestproject.ProfileRegisterBean" scope="application"></jsp:useBean>			
	
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
				<td>${applicationScope.auser.name }</td>
				<td><jsp:getProperty property="name" name="auser"/></td>
			</tr>
			<tr>
				<td>Email</td>
				<td>${applicationScope.auser.email }</td>
				<td><jsp:getProperty property="email" name="auser"/></td>
			</tr>
			<tr>
				<td>Password</td>
				<td>${applicationScope.auser.password }</td>
				<td><jsp:getProperty property="password" name="auser"/></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td>${applicationScope.auser.gender }</td>
				<td><jsp:getProperty property="gender" name="auser"/></td>
			</tr>
			<tr>
				<td>Current Attending Class</td>
				<td>${applicationScope.auser.course }</td>
				<td><jsp:getProperty property="course" name="auser"/></td>
			</tr>
			<tr>
				<td>Education</td>
				<td>${applicationScope.auser.education }</td>
				<td><jsp:getProperty property="education" name="auser"/></td>
			</tr>
		</table>
	</div>
</body>
</html>