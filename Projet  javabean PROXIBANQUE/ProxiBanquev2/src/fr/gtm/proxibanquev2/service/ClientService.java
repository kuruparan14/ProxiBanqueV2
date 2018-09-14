package fr.gtm.proxibanquev2.service;

import java.sql.Connection;
import java.util.ArrayList;

import fr.gtm.proxibanquev2.dao.ClientDao;
import fr.gtm.proxibanquev2.domaine.Client;

/**
 * @author Kuru, Lyes, Renata
 *
 */

public class ClientService {

	/**
	 * Déclaration du Dao
	 */
	private ClientDao clientDao;

	public ClientService(Connection cn) {
		this.clientDao = new ClientDao(cn);

	}

	public void recupererClient(int idClient) {
		this.clientDao.getClientById(idClient);

	}

	public void editerClient(Client clientNew) {
		this.clientDao.updateClient(clientNew);

	}

}
