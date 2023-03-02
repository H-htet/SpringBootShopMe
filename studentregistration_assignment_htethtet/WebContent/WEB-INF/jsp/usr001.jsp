<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>(USR001) User Search </title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/stylesheets/container.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/stylesheets/base.css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/general.js" ></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/accordion-menu.js" ></script>
<script type="text/javascript">
	window.onload=function()
    {
    	menu();

        var param = getPara( 'flag');
        if(param==1)
        {
            document.getElementById('list').style.display="block";           
        }
        else
        {
            document.getElementById('list').style.display="none";
        }
    }

    function searchList(flag)
    {
        if(flag==1){
             document.getElementById('list').style.display="block";
        
        }else{
            document.getElementById('list').style.display="none";
           
        }
    }
	function resetForm()
	{
		document.getElementById('message').innerHTML = "Message";
		document.getElementById('list').style.display="none";
	}

	function checkDelete()
    {
        var con = confirm("Are you sure to delete?");
        if(con)
        {
            window.location.replace('USR001.html?flag=1')
        }

    }
	
</script>
</head>
<body class="main_body">
	<form:form  action="/studentregistration_assignment_htethtet/usr001process" method="post" modelAttribute="bean">
	<div id="header">
        <div id="title">
            <a href="/studentregistration_assignment_htethtet/welcome">Student Registration Assignment</a>
        </div>
          <div id="menuLoginTime">
            <table>
                <tr>
                    <td>User</td><td>: ${userid } &nbsp;&nbsp; ${username }</td>
                </tr>
                <tr>
                    <td>Current Date</td><td>:  YYYY/MM/DD hh:mm:ss</td>
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
                <div class="search_form">
				<h3>User Search</h3>
				<form>
				<table class="tableForm">
					<tr>						
						
						<td class="tblLabel"><form:label path="userId">User ID</form:label></td>
						<td class="tblInputNormal"><form:input path="userId" type="text" id="txtUserId" class="txt"/></td>
						
						<td class="tblLabel"><form:label path="userName"> User Name</form:label>	</td>
						<td class="tblInputNormal"><form:input path="userName" type="text" id="txtUserName" class="txt"/>	　</td>			
						
					</tr>
				</table>
				<br/>
				<input type="submit"  value="Search"  class="button"/> <!-- onClick="searchList(1)" onclick="location.href='/studentregistration_assignment_htethtet/usr001process'"-->
				<a href="USR002.html">
                    <input type="button" value="Add" class="button" id="userInsert" />
                 </a>
				<input type="reset"  value="Reset" onClick="resetForm()" class="button"/>
				</form>
				<br/>
				<br/>	
				<div id="errormsg">
					<label id="message">${error }</label>
				</div>
			</div>   

                <br/><br/><br/>
			<!-- div id="list"> -->
				<form name="listForm" >
					<table class="resultTable">
						<tr class="tblHeader">
							<th width="1%">Delete</th>
							<th width="1%">Update</th>
							<th width="12%">User ID</th>
							<th width="24%">User Name</th>
						</tr>
						<c:forEach items="${list}" var="data">
						<tr>
								<td><input type="button" value="Delete" id="delete" class="button" onClick="javascript:checkDelete()" /></td>
								<td><a href="USR002-01.html"><input type="button" value="Update" class="button" id="userUpdate" /></a></td>
								<td>${data.userId}</td>
								<td>${data.userName}</td>		
											
							</tr>
						</c:forEach>
						
					</table>
					<!--  table class="resultTable">
						<tr class="tblHeader">
							<th width="1%">Delete</th>
							<th width="1%">Update</th>
							<th width="12%">User ID</th>
							<th width="24%">User Name</th>
							
						</tr>
						<tr>
						 	<td>
                             	<input type="button" value="Delete" id="delete" class="button" onClick="javascript:checkDelete()" />
                            </td>
							<td>
								<a href="USR002-01.html">
                            		<input type="button" value="Update" class="button" id="userUpdate" />
                        		</a>
                        	</td>
                           
							<td>U000001</td>
							<td>Kyaw Kyaw</td>                
						</tr>
						<tr>
						 	<td>
                             	<input type="button" value="Delete" id="delete" class="button" onClick="javascript:checkDelete()" />
                            </td>
							<td>
								<a href="USR002-01.html">
	                            		<input type="button" value="Update" class="button" id="userUpdate" />
	                        	</a>
                        	</td>
                           
							<td> U000002</td>
							<td>Zaw Zaw</td>
						</tr>
						<tr>
                            <td>
                             	<input type="button" value="Delete" id="delete" class="button" onClick="javascript:checkDelete()" />
                            </td>
							<td>
								<a href="USR002-01.html">
	                            	<input type="button" value="Update" class="button" id="userUpdate" />
                        		</a>
                        	</td>
							<td>U000003</td>
							<td>Aung Aung</td>
						</tr>
						<tr>
                            <td>
                             	<input type="button" value="Delete" id="delete" class="button" onClick="javascript:checkDelete()" />
                            </td>
							<td>
								<a href="USR002-01.html">
                            		<input type="button" value="Update" class="button" id="userUpdate" />
                        		</a>
                        	</td>
							<td> U000004</td>
							<td>Maung Maung</td>
						</tr>
						<tr>
                            <td>
                             	<input type="button" value="Delete" id="delete" class="button" onClick="javascript:checkDelete()" />
                            </td>
							<td>
								<a href="USR002-01.html">
                            		<input type="button" value="Update" class="button" id="userUpdate" />
                        		</a>
                        	</td>
							<td>U000005</td>
							<td>Ko Ko</td>
						</tr>
						<tr>
                            <td>
                             	<input type="button" value="Delete" id="delete" class="button" onClick="javascript:checkDelete()" />
                            </td>
                            <td>
								<a href="USR002-01.html">
                            		<input type="button" value="Update" class="button" id="userUpdate" />
                        		</a>
                        	</td>
							<td> U000006</td>
							<td>Aung Kyaw</td>
						</tr>
						<tr>
							<td>
                             	<input type="button" value="Delete" id="delete" class="button" onClick="javascript:checkDelete()" />
                            </td>
							<td>
								<a href="USR002-01.html">
	                            	<input type="button" value="Update" class="button" id="userUpdate" />
	                        	</a>
                        	</td>
							<td>U000007</td>
							<td>Ko Ko</td>
						</tr>
						<tr>
							<td>
                             	<input type="button" value="Delete" id="delete" class="button" onClick="javascript:checkDelete()" />
                            </td>
							<td>
								<a href="USR002-01.html">
                            		<input type="button" value="Update" class="button" id="userUpdate" />
                        		</a>
                        	</td>
                        	<td> U000008</td>
							<td>Nwe Nwe</td>
						</tr>
						<tr>
							<td>
                             	<input type="button" value="Delete" id="delete" class="button" onClick="javascript:checkDelete()" />
                            </td>
							<td>
								<a href="USR002-01.html">
                            		<input type="button" value="Update" class="button" id="userUpdate" />
                        		</a>
                        	</td>
							<td> U000009</td>
							<td>Tin Tin</td>
						</tr>
						<tr>
							<td>
                             	<input type="button" value="Delete" id="delete" class="button" onClick="javascript:checkDelete()" />
                            </td>
							<td>
								<a href="USR002-01.html">
                            		<input type="button" value="Update" class="button" id="userUpdate" />
                        		</a>
                        	</td>
                            
							<td> U000010</td>
							<td>Aye Aye</td>
						</tr>
					</table>
					-->
				</form>
			<!--  /div>    -->

            </div>
            </div>
                
            </div> 
            <div class="footer"> 
            <span>Copyright &#169; ACE Inspiration 2016</span>        
    </div>
     </div>
    </form:form>
</body>
</html>