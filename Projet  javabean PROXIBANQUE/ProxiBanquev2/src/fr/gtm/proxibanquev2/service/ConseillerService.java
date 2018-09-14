package fr.gtm.proxibanquev2.service;

import java.sql.Connection;

import fr.gtm.proxibanquev2.dao.ClientDao;

public class ConseillerService {

	public boolean estValide(String login, String password) {

		if (("kuru".equalsIgnoreCase(login)) && ("renata".equalsIgnoreCase(password)))
			return true;
		else
			return false;
	}

	
	
	
	
	
	
}
