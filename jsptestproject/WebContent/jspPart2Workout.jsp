<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Part-2 WorkOut</title>
</head>
<body>
	<form action="JSPPart2WorkoutServlet">
	Select Subject: 
	<select name="subject" multiple>
		<option value="Java">Java</option>
		<option value="PHP">PHP</option>
		<option value="ASP.NET">ASP.NET</option>	
		<option value="Android">Android</option>			
	</select>
	<input type="submit" value="choose" />
	</form>
</body>
</html>