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
<h1>Keeper List</h1>
<%
try{
	DBManager dbM = new DBManager();
	dbM.getConnection();
	KeeperContentManager kcm = new KeeperContentManager();
	ArrayList<Keeper> keeper = kcm.selectAll();
%>
<table>
<tr>
<th>KeeperId</th>
<th>Name</th>
<th>Dateofbirth</th>
<th>Email</th>
<th>Phone</th>
<th>Rank</th>
<th>Update</th>
<th>Delete</th>
</tr>
<%
for(Keeper eachKeeper:keeper){
%>
<tr>
<td><%=eachKeeper.getKeeperId() %></td>
<td><%=eachKeeper.getName()%></td>
<td><%=eachKeeper.getDateofbirth()%></td>
<td><%=eachKeeper.getEmail()%></td>
<td><%=eachKeeper.getPhone()%></td>
<td><%=eachKeeper.getRank()%></td>
<td><a href="Keeper_update.jsp?id=<%=eachKeeper.getKeeperId() %>">Update</a></td>
<td><a href="Keeper_delete_action.jsp?id=<%=eachKeeper.getKeeperId() %>">Delete</a></td>
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