<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.crud.*" %>
<%@ page import="com.dbconnector.*" %>
<%@ page import="com.content.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Go Wild Wildlife Park</title>
</head>
<body>
<form action="Enclosure_update_action.jsp">
<%
int id = Integer.valueOf(request.getParameter("id"));
EnclosureContentManager encm = new EnclosureContentManager();
try{
	Enclosure en = encm.getById(id);
%>
<label>Enclosure Id</label>
<input type="text" name="id" value="<%=en.getEnclosureId() %>">
<br>
<label>Enclosure Type</label>
<input type="text" name="type" value="<%=en.getType() %>">
<br>
<label>Enclosure Location</label>
<input type="text" name="location" value="<%=en.getLocation() %>">
<br>
<button type="Submit">Save</button>
<button type="Reset">Reset</button>
<%
}
catch (SQLException e) {
		e.printStackTrace();
	}
%>
</form>
</body>
</html>