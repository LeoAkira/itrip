<%@page import="br.usp.pcs.mvc.Hotel"%>
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
	<h2>Lista de hotéis</h2>
	<%
		ArrayList<Hotel> hoteis = (ArrayList<Hotel>) request.getAttribute("hoteis");
		
		for (Hotel hotel : hoteis) { %>
			<div class="hotel-container">
				<p>Nome:
					<a href="/itrip/HotelController?id=<%= hotel.getId() %>"> 
						<b><%= hotel.getNome() %></b>
					</a>
				</p>
				<p>Preço da diária: <b>R$ <%= hotel.getPrecoDiaria() %></b></p>
				<p>Endereço: <b><%= hotel.getEndereco()%></b></p>
			</div>
		<% }
	%>

</body>
</html>