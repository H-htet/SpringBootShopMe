<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ page import="java.util.Date" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>(M00001)Top Menu</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/stylesheets/container.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/stylesheets/base.css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/accordion-menu.js" ></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/general.js" ></script>
<script type="text/javascript">
    window.onload=function()
    {
        menu();  
    }


</script>
</head>
<body class="main_body">
<form:form action="/studentregistration_assignment_htethtet/usr001" method="get" modelAttribute="bean">
	<div id="header">
        <div id="title">
            <a href="/studentregistration_assignment_htethtet/welcome">Student Registration Assignment</a>
        </div>
          <div id="menuLoginTime">
            <table>
                <tr>
                	<c:forEach items="${list}" var="data">
                    <td>User</td><td>: ${data.userId } &nbsp;&nbsp; ${data.userName }</td>
                    </c:forEach>
                </tr>
                <tr>                	
                    <td>Current Date</td><td>: <fmt:formatDate pattern="YYYY/MM/DD" value="${now}" /> </td>
                </tr>
            </table>
        </div>
        <input id="btn_logout" class="button" type="button" value="Logout" onclick="location.href='/studentregistration_assignment_htethtet/'">    
    </div>

    <div id="container"> 
            <div id="left_menu">
                <!-- menu html code exist the menu function of general.js -->
                
            </div>
            <div id="main_contents">     
                <div id="contents">
                <h4 style="color:brown;">Welcome...!<br/><br/>
This is the final exam project of the Java Web Development Course.</h4>
                </div>

            </div> 
            
     </div>

    <div class="footer"> 
            <span>Copyright &#169; ACE Inspiration 2016</span>        
    </div>
 </form:form>
</body>
</html>