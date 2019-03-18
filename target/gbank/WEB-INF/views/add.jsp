<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="../shared/head.jsp" %>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ajouter un compte</title>
</head>
<body>
<h1>ajouter un compte</h1>
<form action="addCompte" method="Post">
<input name="capital" type="text"/><br/> 
<input name="desc" type="text"/><br/>
<input name="num" type="text"/><br/>
<input type="submit"/>
</form>
</body>
</html>