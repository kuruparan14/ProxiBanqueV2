package fr.gtm.proxibanquev2.presentation;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.Connection;

import fr.gtm.proxibanquev2.dao.ClientDao;
import fr.gtm.proxibanquev2.dao.GestionConnexionBDD;
import fr.gtm.proxibanquev2.domaine.Client;
import fr.gtm.proxibanquev2.service.ClientService;
import fr.gtm.proxibanquev2.service.ConseillerService;

@WebServlet("/MaServlet")
public class MaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MaServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// TODO Auto-generated method stub
		traitement(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		traitement(request, response);
		// TODO Auto-generated method stub

	}

	protected void traitement(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("loginuser");
		String password = request.getParameter("mdpuser");

		GestionConnexionBDD bdd = new GestionConnexionBDD();
		bdd.connexionBDD();
		ConseillerService serviceConseiller = new ConseillerService();
		ClientService clientService = new ClientService(bdd.getConnexion());
		ClientDao clientDao = new ClientDao(bdd.getConnexion());

		// Liste Clients

		ArrayList<Client> maListeClients = clientDao.getAllClients();
		for (Client client : maListeClients) {
			System.out.println(" Client: " + client);
		}

		HttpSession session = request.getSession();
		session.setAttribute("Listeclients", maListeClients);

		RequestDispatcher dispatcher;

		if (serviceConseiller.estValide(login, password) == true) {

			dispatcher = request.getRequestDispatcher("ListClients.jsp");

		} else {
			dispatcher = request.getRequestDispatcher("erreur.jsp");
		}

		dispatcher.forward(request, response);
		bdd.deconnexionBDD();

	}

}
