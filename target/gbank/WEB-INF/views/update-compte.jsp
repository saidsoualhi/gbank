<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="../shared/head.jsp" %>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update un compte</title>
</head>
<body>
	
<h1>Update un compte</h1>
<form action="./../updateCompte" method="Post">
    <input name="id" type="number" value="${compteToUpdate.id}" class="hidden"/>
	<input name="capital" type="text" value="${compteToUpdate.capital}"/><br/>
	<input name="desc" type="text" value="${compteToUpdate.description}"/><br/>
	<input name="num" type="text" value="${compteToUpdate.num}"/><br/>
	<input type="submit"/>
</form>

</body>
</html>