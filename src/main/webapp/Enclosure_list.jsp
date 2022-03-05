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
<style>
table,th,td{
	border:10px solid black;
	}
</style>
</head>
<body>
<h1>Enclosure List</h1>
<%
try{
	DBManager dbm = new DBManager();
	dbm.getConnection();
	EnclosureContentManager ecm = new EnclosureContentManager();
	ArrayList<Enclosure> enclosure = ecm.selectAll();
%>
<table>
<tr>
<th>Enclosure ID</th>
<th>Type </th>
<th>Location</th>
<th>Update</th>
<th>Delete</th>
</tr>
<%
for(Enclosure eachEnclosure:enclosure){
%>
<tr>
<td><%=eachEnclosure.getEnclosureId() %></td>
<td><%=eachEnclosure.getType()%></td>
<td><%=eachEnclosure.getLocation()%></td>
<td><a href="Enclosure_update.jsp?id=<%=eachEnclosure.getEnclosureId() %>">Update</a></td>
<td><a href="Enclosure_delete_action.jsp?id=<%=eachEnclosure.getEnclosureId() %>">Delete</a></td>
</tr>
<%
}
}
catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
%>
</table>

</body>
</html>