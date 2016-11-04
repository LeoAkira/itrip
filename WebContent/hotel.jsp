<%@page import="br.usp.pcs.mvc.Hotel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Página de um hotel</h2>
	<% Hotel hotel = (Hotel) request.getAttribute("hotel"); %>
	<% String id = (String) request.getAttribute("id"); %>
	<div class="hotel-container">
		<p>Id: <b><%= id %></b></p>
		<%
			if (hotel != null) { %>
				<p>Nome: <b><%= hotel.getNome() %></b></p>
				<p>Preço da diária: <b>R$ <%= hotel.getPrecoDiaria() %></b></p>
				<p>Endereço: <b><%= hotel.getEndereco()%></b></p>		
			<% } else { %>
				<p>Hotel não encontrado!</p>
			<% }
		%>
	<a href="/itrip/HoteisController">Voltar</a>
		 
	</div>
</body>
</html>