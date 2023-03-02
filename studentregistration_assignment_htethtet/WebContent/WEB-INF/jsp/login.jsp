<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>(LGN001)login </title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/stylesheets/container.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/stylesheets/base.css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/accordion-menu.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/general.js"></script>

<SCRIPT type="text/javascript">
    window.history.forward();
    function noBack() { window.history.forward(); }
</SCRIPT>

</head>

<body class="main_body" onload="noBack();" onpageshow="if (event.persisted) noBack();" onunload="">
	<div id="header">
	<img src="${pageContext.request.contextPath}/js/test.png" alt="login">
        <div id="title">
            <u>Student Registration Assignment</u>     
        </div> 
    </div>
    <div id="container"> 
        <div id="main_contents">     
                <div style="margin-left:35%">                
                    <form:form action="/studentregistration_assignment_htethtet/loginprocess" method="post" modelAttribute="bean">
                    <br />  
                    <table class="sortName">
                        <tr>
                            <td colspan="2" align="center">
                                <h3>Login</h3>                                
                            </td>
                        </tr>    
                        <tr>
                        	<td><p style="color:red;">${error }</p></td>
                        </tr>               
                        <tr align="left">                          
                            <td><form:label path="userId" >User ID</form:label></td>
							<td><form:input path="userId" type="text" class="normal_width1"/></td>
							<td><form:errors path="userId" id="errormsg"></form:errors></td>
                        </tr> 
                        <tr align="left">
                            <td><form:label path="userPassword">Password</form:label></td>                            
                            <td><form:input path="userPassword" type="password" class="normal_width1" /></td>
                            <td><form:errors path="userPassword" id="errormsg"></form:errors></td>
                        </tr>
                        <tr>
	                        <td colspan="2">
	                            <table align="center">
	                            <tr>
	                            	<td><input name="Submit" type="submit" value="Login" class="button" /></td>
	                            </tr>	                                
	                     		</table>
	                      </td>
                        </tr>                             
                    </table> 
                    </form:form>  

            </div>  
        </div> <!-- end of main contents --> 
    </div><!-- end of container -->
    
    <div class="footer">    
        <span>Copyright &#169; ACE Inspiration 2016</span>
    </div>   
   
</body>
</html>