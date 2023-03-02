<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Part-2 WorkOut</title>
</head>
<body>
	<% String[] subject = (String[]) request.getServletContext().getAttribute("a"); %>
	<% 	
	if(subject == null) {		
		request.getRequestDispatcher("jspPart2Workout.jsp").include(request, response);	
		out.println("<p style='color:red;'>Choose One!!!!</p>");
	} else {
		out.println("<strong>Your professional is :</strong><br><br>");
		int i=1;
		for(String subj:subject){
			out.println(i+". "+subj+"<br>");
			i++;			
		}
	}
	%>

</body>
</html>