<%@page import="br.usp.pcs.mvc.Cidade"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% Cidade cidade = (Cidade) request.getAttribute("cidade"); %>
	<table>
	  <tr>
	    <td>Nome</td>
	    <td><%= cidade.getNome() %></td>
	    </tr><tr>
	    <td>Tem Aeroporto?</td>
	    <td><%= cidade.isTemAeroporto() ? "SIM" : "NÃO" %></td>
	    </tr><tr> 
	    <td>Número de dias ideal</td>
	    <td><%= cidade.getNumeroDiasIdeal() %></td> 
	  </tr>
	</table>
	<a href="/itrip/CidadesController">Voltar</a>
</body>
</html>