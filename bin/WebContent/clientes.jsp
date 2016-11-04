<%@page import="br.usp.pcs.mvc.Cliente" %>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	.hotel-container {
		border-bottom: 1px solid black;
	}
</style>
</head>
<body>
	<h2>Lista de clientes</h2>
	<%
		ArrayList<Cliente> clientes = (ArrayList<Cliente>) request.getAttribute("clientes");
		
		for (Cliente cliente : clientes) { %>
			<div class="">
				<p>Nome:
					<a> 
						<b><%= cliente.getNome() %></b>
					</a>
				</p>
				<p>CPF: <b><%= cliente.getCpf() %></b></p>
			</div>
			<hr>
		<% }
	%>

</body>
</html>