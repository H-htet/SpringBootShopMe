<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Part-1 WorkOut</title>
</head>
<body>
	<% 
		String name = request.getParameter("name"); 
		String dob = request.getParameter("dob");
		String gender = request.getParameter("gender");
		String [] subject = request.getParameterValues("subject");	
	%>
	<%= "Name : " + name + "<br>" %>
	<%= "DOB : " + dob + "<br>" %>
	<%= "Gender : " + gender + "<br>" %>	
	<% 	
		int i=1;
		for(String subj:subject){
			out.println("Subject"+i+" : "+subj+"<br>");
			i++;
		}
	%>
</body>
</html>