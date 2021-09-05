<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agendamento</title>
</head>
<body>
<form action="ServletPaginaAgenda" method="get">
	<h>digite seu nome: <h><input type="text" name ="nome" />
	<h>digite seu telefone: <h><input type="number" name ="telefone" />
	<h>coloque sua data de nascimento: <h></h><input type="date" name ="data" />
	<input type="submit" name ="Enviar" />
</form>
</body>
</html>