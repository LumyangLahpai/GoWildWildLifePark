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
int id=Integer.valueOf(request.getParameter("id"));
String type= request.getParameter("type");
String location= request.getParameter("location");
EnclosureContentManager ecm = new EnclosureContentManager();
Enclosure enclosures = new Enclosure(id,type,location);
int rowsAffected;
try {

    rowsAffected = ecm.update(enclosures);
    out.println("No of rows affected - " + rowsAffected);

}catch (SQLException e){
    out.println(e.getMessage());

}
%>
</body>
</html>