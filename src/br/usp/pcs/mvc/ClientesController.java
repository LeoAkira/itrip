package br.usp.pcs.mvc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClientesController
 */
@WebServlet("/ClientesController")
public class ClientesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientesController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		  RequestDispatcher rd = request.getRequestDispatcher("clientes.jsp"); 		    
		   
		  ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		  
		  Cliente cliente1 = new Cliente("Cliente 1", new Date(1990, 1, 1), 123, 456, "Rua Blado", 789, "blado@blado.com", 800);
		  Cliente cliente2 = new Cliente("Cliente 2", new Date(1900, 02, 30), 987, 654, "Rua Blado", 321, "blado@blado.com", 190);
		  clientes.add(cliente1);
		  clientes.add(cliente2);

				  
		  request.setAttribute("clientes", clientes);
		    
		    		
		  rd.forward(request, response);//method may be include or forward  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
