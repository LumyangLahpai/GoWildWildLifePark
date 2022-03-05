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
<title>Keeper Action</title>
</head>
<body>
<%
String kName = request.getParameter("keeper_name");
String kDOB = request.getParameter("keeper_dateofbirth");
String kEmail = request.getParameter("keeper_email");
String kPhone = request.getParameter("keeper_phone");
String kRank = request.getParameter("keeper_rank");
out.print(kName+kDOB+kEmail+kPhone+kRank);
DBManager dbM = new DBManager();
try{
	dbM.getConnection();
	out.println("Connection successfully");
	Keeper keeper = new Keeper(kName,kDOB, kEmail, kPhone, kRank);
	KeeperContentManager kcm = new KeeperContentManager();
	int rowInserted = kcm.insert(keeper);
	if(rowInserted==1){
		out.println("Successfully inserted");
	}
}
catch(SQLException e){
	e.printStackTrace();
}
%>
</body>
</html>