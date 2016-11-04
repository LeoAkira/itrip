<%@ page import ="br.usp.pcs.mvc.Cliente" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Cliente</h2>
	<% Cliente cliente = (Cliente) request.getAttribute("cliente"); %>
	<div class="cliente-container">
		<%
			if (cliente != null) { %>
				<p>Nome: <b><%= cliente.getNome() %></b></p>
				<p>Nascimento: <b><%= cliente.getNascimento() %></b></p>
				<p>CPF: <b><%= cliente.getCpf() %></b></p>
				<p>RG: <b><%= cliente.getRg() %></b></p>
				<p>Endereço: <b><%= cliente.getEndereco() %></b></p>
				<p>Passaporte: <b><%= cliente.getPassaporte() %></b></p>
				<p>Email: <b><%= cliente.getEmail() %></b></p>
				<p>Telefone: <b><%= cliente.getTelefone() %></b></p>		
			<% } else { %>
				<p>Cliente não encontrado!</p>
			<% }
		%>
	<a href="/pcs/Controlador">Voltar</a>
		 
	</div>
</body>
