package fr.gtm.proxibanquev2.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.gtm.proxibanquev2.domaine.Client;
import fr.gtm.proxibanquev2.domaine.CompteBanque;
import fr.gtm.proxibanquev2.domaine.Conseiller;
/**
 * @author Lyes, Kuru, Renata
 *
 */


public class ClientDao {

	// Attributs

	Statement st;
	ResultSet rs;
	Connection cn;

	public ClientDao(Connection cn) {
		this.cn = cn;
	}

	public Client getClientById(int idClient) {

		System.out.println("RECUPERATION D'UN CLIENT DONT L'IDENTIFIANT EST:" + idClient);

		try {
			String requete = " SELECT * from client WHERE idClient = " + idClient;
			st = this.cn.createStatement();
			rs = st.executeQuery(requete);
			Client client = new Client();
			while (rs.next()) {
				client.setIdClient(rs.getInt("idClient"));
				client.setNom(rs.getString("nom"));
				client.setPrenom(rs.getString("prenom"));
				client.setEmail(rs.getString("email"));
				client.setAdresse(rs.getString("adresse"));

			}
			return client;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @param client
	 * @return
	 */
	public boolean updateClient(Client client) {
		System.out.println("MISE A JOUR D'UN CLIENT" + client);
		try {
			String requete = "UPDATE client SET" + " nom = '" + client.getNom() + "'," + " prenom = '"
					+ client.getPrenom() + " email = '" + client.getEmail() + " adresse = '" + client.getAdresse() + " WHERE idClient = "
					+ client.getIdClient();

			st = this.cn.createStatement();
			st.executeUpdate(requete);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * @return
	 */
	public ArrayList<Client> getAllClients() {

		try {
			String requete = "SELECT * FROM `client`";
			st = cn.createStatement();
			rs = st.executeQuery(requete);
			ArrayList<Client> maListeClients = new ArrayList<Client>();
			Client client;
			while (rs.next()) {
				client = new Client();
				client.setIdClient(rs.getInt("idClient"));
				client.setNom(rs.getString("nom"));
				client.setPrenom(rs.getString("prenom"));
				client.setEmail(rs.getString("email"));
				client.setAdresse(rs.getString("adresse"));
				//client.setConseillerClient((Conseiller) rs.getObject("idConseiller"));
			//	client.setCompteClient((CompteBanque) rs.getObject("idCompte"));

				maListeClients.add(client);
			}
			return maListeClients;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
