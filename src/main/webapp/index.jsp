<%@page import="ocidevops.businesslogic.BusinessLogic"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" xml:lang="en">
	<head>
	    <title>hello</title>
	</head>
	
	<body>
	    <h1>Hello from OCI -DevOps!</h1>
	    <h4>
	    	This is a dummy project to demonstrate:
	    	<ul>
	    		<li>Java application building using Maven</li>
	    		<li>Running Junits using Maven</li>
	    		<li>Automating the above using Jenkins Pipeline</li>
	    	</ul> 
	    </h4>
	    
	    
	    <form method="post">
	    	<input type="number" name="val1" />
	    	<input type="number" name="val2" />
	    	<input type="Submit" value = "Add"/>
	    </form>
	    <br />
	    
	    <% 
	    	if (request.getParameter("val1") != null && request.getParameter("val2") != null != null) {
	    		int v1 = Integer.parseInt(request.getParameter("val1"));
	    		int v2 = Integer.parseInt(request.getParameter("val2"));
	    		
	    		BusinessLogic logic = new BusinessLogic();
	    		int sum = logic.addAll(v1, v2);
	    	
	    		%><h3>Output of business logic: <%=v1%> +  <%=v2%> = <%=sum%></h3><%
	    	
	    	} 
	    %>
	    
	</body>

</html>
