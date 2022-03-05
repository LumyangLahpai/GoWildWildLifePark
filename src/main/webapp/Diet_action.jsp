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
<title>Diet Action</title>
</head>
<body>
<%
String dType = request.getParameter("diet_type");
int dNumberoffeed = Integer.valueOf(request.getParameter("numberoffeed"));
out.print(dType+dNumberoffeed);
DBManager dbM = new DBManager();
try{
	dbM.getConnection();
	out.print("Connection successfully");
	Diet diet = new Diet(dType, dNumberoffeed);
	DietContentManager dcm = new DietContentManager();
	int rowInserted = dcm.insert(diet);
	if(rowInserted==1){
		out.print("Successfully inserted");
	}
}
catch(SQLException e){
	e.printStackTrace();
}
%>
</body>
</html>