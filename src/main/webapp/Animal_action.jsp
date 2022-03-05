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
<title>Animal_action</title>
</head>
<body>
<%
String aName = request.getParameter("aName");
String aGender = request.getParameter("aGender");
int aYear = Integer.valueOf(request.getParameter("aYear"));
int aEnclosures = Integer.valueOf(request.getParameter("eID"));
int aSpecies = Integer.valueOf(request.getParameter("sID"));
int aDiet = Integer.valueOf(request.getParameter("dID"));
int aKeeper = Integer.valueOf(request.getParameter("kID"));
out.print(aName+aGender+aYear+aEnclosures+aSpecies+aSpecies+aDiet+aKeeper);
DBManager dbM = new DBManager();
try{
	dbM.getConnection();
	out.println("Connection successfully");
	Animal animal = new Animal(aName, aGender,aYear,aEnclosures,aSpecies,aDiet,aKeeper);
	AnimalContentManager kcm = new AnimalContentManager();
	int rowInserted = kcm.insert(animal);
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