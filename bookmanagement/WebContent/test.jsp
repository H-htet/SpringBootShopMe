<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>(LGN001)login </title>
<link rel="stylesheet" type="text/css" href="${pageContex.request.contextPath }/stylesheets/container.css" />
<link rel="stylesheet" type="text/css" href="${pageContex.request.contextPath }/stylesheets/base.css" />


<SCRIPT type="text/javascript">
    window.history.forward();
    function noBack() { window.history.forward(); }
</SCRIPT>

</head>
<body class="main_body" onload="noBack();" onpageshow="if (event.persisted) noBack();" onunload="">
	<div id="header">
        <div id="title">
            <u>Student Registration Assignment</u>     
        </div> 
    </div>

    <div id="container"> 
        <div id="main_contents">     
                <div style="margin-left:35%">
                    <form action="/studentregistration_assignment_htethtet/loginprocess" method="post" modelAttribute="bean">
                    <br />  
                    <table class="sortName">
                        <tr>
                            <td colspan="2" align="center">
                                <h3>Login</h3>                                
                            </td>
                        </tr>                   
                        <tr align="left">                          
                            <td><label path="userId">User ID</label></td>
							<td><input path="userId" class="normal_width1"/></td>
							<td><errors path="userId" id="errormsg"></errors></td>
                        </tr> 
                        <tr align="left">
                            <td><label path="password">Password</label></td>                            
                            <td><input path="password" class="normal_width1" /></td>
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
                    </form>  

            </div>  
        </div> <!-- end of main contents --> 
    </div><!-- end of container -->
    
    <div class="footer">    
        <span>Copyright &#169; ACE Inspiration 2016</span>
    </div>   
   
</body>
</html>