<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Registration Form</h1>
	<form action="ProfileRegisterServlet" method="post">
		<table>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>Confirm Password:</td>
				<td><input type="password" name="comfirm_password"></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td>
					<select name="gender" id="selectlist1">
						<option value="select" selected>select</option>
						<option value="Male">Male</option>
						<option value="Female">Female</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Courses:</td>
				<td>
					<select name="course" id="selectlist2">
						<option value="select" selected>select</option>
						<option value="Java Web Development">Java Web Development</option>
						<option value="ASP.NET Web Development">ASP.NET Web Development</option>
						<option value="PHP Web Fundamental Development">PHP Web Fundamental Development</option>
						<option value="PHP Web Professional Development">PHP Web Professional Development</option>
						<option value="Android Software Development">Android Software Development</option>	
						<option value="iOS Development">iOS Development</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Education:</td>
				<td>
					<select name="education" id="selectlist3">
					<option value="select" selected>select</option>
						<option value="B.Sc">B.Sc</option>
						<option value="M.Sc.(Computer Science)">M.Sc.(Computer Science)</option>
						<option value="B.E(IT)">B.E(IT)</option>
						<option value="B.A.(English)">B.A.(English)</option>						
					</select>
				</td>
			</tr>
<!-- 			<tr> -->
<!-- 				<td>Photo:</td> -->
<!-- 				<td> -->
					
<!-- 					<input type="file" name="file" size="5" /> -->
<!-- 					label for="files">No file selected.</label -->
<!-- 				</td> -->
				
<!-- 			</tr> -->

			<tr>
				<td></td>
				<td><input type="submit" value="Register" /></td>
			</tr>
			
		</table>
		
	</form>
</body>
</html>