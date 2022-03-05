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
<title>Report1</title>
<style>
table,th,td{
	border:2px solid black;
	}
</style>
</head>
<body>
<h1>Report1</h1>
<%
try{
	DBManager dbM = new DBManager();
	dbM.getConnection();
	AnimalContentManager acm = new AnimalContentManager();
	ArrayList<Animal> animal = acm.selectAllGroupByName();
%>
<table>
<tr>
<th>AnimalID</th>
<th>AnimalName</th>
<th>Gender</th>
<th>ArrivedYear</th>
<th>KeeperID</th>
<th>Name</th>
</tr>
<%
for(Animal eachAnimal:animal){
%>
<tr>
<td><%=eachAnimal.getAnimal_ID() %></td>
<td><%=eachAnimal.getAnimal_Name() %></td>
<td><%=eachAnimal.getGender() %></td>
<td><%=eachAnimal.getYear() %></td>
<td><%=eachAnimal.getKeeper_ID() %></td>
<td><%=eachAnimal.getName() %></td>
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