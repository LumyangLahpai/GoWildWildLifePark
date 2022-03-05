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
<%
int id=Integer.valueOf(request.getParameter("keeperId"));
String Name= request.getParameter("Name");
String Dateofbirth= request.getParameter("keeper_dateofbirth");
String Email= request.getParameter("Email");
String Phone= request.getParameter("Phone");
String Rank= request.getParameter("Rank");
KeeperContentManager kcm = new KeeperContentManager();
Keeper keeper = new Keeper(id,Name,Dateofbirth,Email,Phone,Rank);
int rowsAffected;
try {

    rowsAffected = kcm.update(keeper);
    out.println("No of rows affected - " + rowsAffected);

}catch (SQLException e){
    out.println(e.getMessage());

}
%>
</body>
</html>