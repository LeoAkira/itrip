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
 * Servlet implementation class CidadeController
 */
@WebServlet("/CidadeController")
public class CidadeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ArrayList<Cidade> cidades = new ArrayList<Cidade>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CidadeController() {
        super();
        // TODO Auto-generated constructor stub
		Cidade cidade1 = new Cidade("1", "São Paulo",true,5);
		Cidade cidade2 = new Cidade("2", "Rio de Janeiro",true,14);
		Cidade cidade3 = new Cidade("3", "São Bernardo do Campo",true,2);
		Cidade cidade4 = new Cidade("4", "Rio Branco",false,0);
		
		cidades.add(cidade1);
		cidades.add(cidade2);
		cidades.add(cidade3);
		cidades.add(cidade4);
    }

    private Cidade findCidadeById(String id){
    	for(Cidade cidade : cidades){
			if(cidade.getId().equals(id)){
				return cidade;
			}
		}
		return null;
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = (String) request.getParameter("id");
		// TODO Auto-generated method stub

		Cidade cidade = this.findCidadeById(id);
		
		
		RequestDispatcher rd= request.getRequestDispatcher("cidade.jsp");
		
		request.setAttribute("cidade",cidade);
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
