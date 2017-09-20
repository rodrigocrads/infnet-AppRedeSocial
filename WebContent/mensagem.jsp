<%@page import="java.util.List"%>
<%@page import="negocio.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mensagem</title>
</head>
<body>
	<form action='CalculaController' method='get'>
		<input type='submit' value='Voltar' />
		<hr>
		<% 
			Usuario usuario = (Usuario) request.getAttribute("usuario");
		%>
		<h2><%= usuario.obterMensagem() %></h2>
		
		<label>NOME:</label><br />
		<input type="text" name="name" value="<%= usuario.getNome() %>" /><br />
		
		<label>ANO NASC:</label><br />
		<input type="text" name="anoNascimento" value="<%= usuario.getAnoNascimento() %>" /><br />
		
		<label>SALARIO:</label><br />
		<input type="text" name="salario" value="<%= usuario.getSalario() %>" /><br />
		
		<label>MESES TRABALHADOS:</label><br />
		<input type="text" name="mesesTrabalhados" value="<%= usuario.getMesesTrabalhados() %>" /> <br />
	</form>
</body>
</html>