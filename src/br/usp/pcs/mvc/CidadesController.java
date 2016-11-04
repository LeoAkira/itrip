package br.usp.pcs.mvc;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CidadesController
 */
@WebServlet("/CidadesController")
public class CidadesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CidadesController() {
        super();
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Cidade cidade1 = new Cidade("1", "São Paulo",true,5);
		Cidade cidade2 = new Cidade("2", "Rio de Janeiro",true,14);
		Cidade cidade3 = new Cidade("3", "São Bernardo do Campo",true,2);
		Cidade cidade4 = new Cidade("4", "Rio Branco",false,0);
		
		ArrayList<Cidade> cidades = new ArrayList<Cidade>();
		cidades.add(cidade1);
		cidades.add(cidade2);
		cidades.add(cidade3);
		cidades.add(cidade4);

		RequestDispatcher rd= request.getRequestDispatcher("cidades.jsp");
		
		request.setAttribute("cidades",cidades);
		rd.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);	
	}

}
