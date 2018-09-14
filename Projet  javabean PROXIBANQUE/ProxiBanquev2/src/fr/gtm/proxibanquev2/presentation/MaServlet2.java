package fr.gtm.proxibanquev2.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.gtm.proxibanquev2.dao.GestionConnexionBDD;
import fr.gtm.proxibanquev2.domaine.Client;
import fr.gtm.proxibanquev2.service.ClientService;

/**
 * Servlet implementation class MaServlet2
 */
@WebServlet("/MaServlet2")
public class MaServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MaServlet2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		GestionConnexionBDD bdd = new GestionConnexionBDD();
		bdd.connexionBDD();
		ClientService clientService = new ClientService(bdd.getConnexion());

		// String idNew = request.getParameter("newiduser");
		String nomNew = request.getParameter("newnomuser");
		String prenomNew = request.getParameter("newprenomuser");
		String emailNew = request.getParameter("newemailuser");
		String adresseNew = request.getParameter("newadresseuser");

		Client clientnew = new Client(nomNew, prenomNew, emailNew, adresseNew);
		clientService.recupererClient(1);

		HttpSession session = request.getSession();
		session.setAttribute("client", clientnew);

		RequestDispatcher dispatcher;

		dispatcher = request.getRequestDispatcher("clientId.jsp");

		dispatcher.forward(request, response);

		bdd.deconnexionBDD();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}
}