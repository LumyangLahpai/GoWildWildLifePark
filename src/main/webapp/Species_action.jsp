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
<title>Species Action</title>
</head>
<body>
<%
String sType = request.getParameter("species_type");
String sGroup = request.getParameter("species_group");
String sConversationStatus = request.getParameter("conversation_status");
String sLifeStyle = request.getParameter("life_style");
DBManager dbM = new DBManager();
try{
	dbM.getConnection();
	out.print("Connection successfully");
	Species species = new Species(sType,sGroup,sConversationStatus,sLifeStyle);
	SpeciesContentManager scm = new SpeciesContentManager();
	int rowInserted = scm.insert(species);
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