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
<title>Go Wild WIldlife Park</title>
</head>
<body>
<form action="Keeper_update_action.jsp">
<%
int keeperId = Integer.valueOf(request.getParameter("id"));
KeeperContentManager kcm = new KeeperContentManager();
try{
	Keeper kp = kcm.getById(keeperId);
%>
<label>K</label>
<input type="text" name="keeperId" value="<%=kp.getKeeperId() %>">
<br>
<label>Keeper Name</label>
<input type="text" name="Name" value="<%=kp.getName() %>">
<br>
<label>Date Of Birth</label>
<input type="date" name="keeper_dateofbirth" value="<%=kp.getDateofbirth() %>">
<br>
<label>Keeper Email</label>
<input type="text" name="Email" value="<%=kp.getEmail() %>">
<br>
<label>Keeper Phone</label>
<input type="text" name="Phone" value="<%=kp.getPhone() %>">
<br>
<label>Keeper Rank</label>
<input type="text" name="Rank" value="<%=kp.getRank() %>">
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
