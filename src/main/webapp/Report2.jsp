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
<title>Report2</title>
<style>
table,th,td{
	border:2px solid black;
	}
</style>
</head>
<body>
<h1>Report2</h1>
<%
try{
	DBManager dbM = new DBManager();
	dbM.getConnection();
	AnimalContentManager acm = new AnimalContentManager();
	ArrayList<Animal> animal = acm.selectAnimalandKeeperCount();
%>
<table>
<tr>
<th>Name</th>
<th>TotalAnimal</th>
</tr>
<%
for(Animal eachAnimal:animal){
%>
<tr>
<td><%=eachAnimal.getName() %></td>
<td><%=eachAnimal.getTotalAnimal() %></td>
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