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
<h1>Animal List</h1>
<%
try{
	DBManager dbm = new DBManager();
	dbm.getConnection();
	AnimalContentManager acm = new AnimalContentManager();
	ArrayList<Animal> animallist = acm.selectAll();
%>
<table>
<tr>
<th>Animal ID</th>
<th>Animal Name</th>
<th>Gender</th>
<th>Year</th>
<th>Enclosure ID</th>
<th>Species ID</th>
<th>Diet ID</th>
<th>Keeper ID</th>
</tr>
<%
for(Animal eachAnimal:animallist){
%>
<tr>
<td><%=eachAnimal.getAnimal_ID() %></td>
<td><%=eachAnimal.getAnimal_Name() %></td>
<td><%=eachAnimal.getGender() %></td>
<td><%=eachAnimal.getYear() %></td>
<td><%=eachAnimal.getEnclosures_ID() %></td>
<td><%=eachAnimal.getSpecies_ID() %></td>
<td><%=eachAnimal.getDiet_ID() %></td>
<td><%=eachAnimal.getKeeper_ID() %></td>

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