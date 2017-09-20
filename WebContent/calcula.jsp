<%@page import="java.util.List"%>
<%@page import="negocio.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="CalculaController" method="post">
		<input type="submit" value="Calcular" />
		<hr />
		<label>NOME:</label><br />
		<input type="text" name="nome" /><br />
		
		<label>ANO NASC:</label><br />
		<input type="text" name="anoNascimento" /><br />
		
		<label>SALARIO:</label><br />
		<input type="text" name="salario" /><br />
		
		<label>MESES TRABALHADOS:</label><br />
		<input type="text" name="mesesTrabalhados" /> <br />
	</form>
	
	<hr />
	
	Mensagens:
	
	<% 
		List <Usuario> usuarios = (List<Usuario>) request.getAttribute("usuarios");
	 	for(Usuario usuario : usuarios){ 
	 %>
		<h3><%= usuario.obterMensagem() %></h3>
	<% 	} %>
</body>
</html>