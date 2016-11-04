<%@page import="br.usp.pcs.mvc.Cidade"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Cidades</title>
</head>
<body><table>
  <tr>
    <th>Cidades</th>
  </tr>
  <% ArrayList<Cidade> cidades = (ArrayList<Cidade>) request.getAttribute("cidades");
  
	for(Cidade cidade : cidades){ %>
		<tr>
			<td>
			<a href="/itrip/CidadeController?id=<%= cidade.getId()%>"> 
			<%= cidade.getNome() %>
			</a>
			</td>
		</tr>
	<% } %>
</table>

</body>
</html>