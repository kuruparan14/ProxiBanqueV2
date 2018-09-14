package fr.gtm.proxibanquev2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * @author Lyes, Kuru, Renata
 *
 */
public class GestionConnexionBDD {

	/**
	 *  Attributs ::Information d'acces� la BDD

	 */
	Connection cn;
	String url = "jdbc:mysql://localhost/proxibanque?autoReconnect=true&useSSL=false";
	String login = "root";
	String passwd = "";

	// Methodes me�tier

	// Methode permettant de se connecter a� la base de données MySQL avec son pilote
	// de JDBC MySQL
	public void connexionBDD() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, login, passwd);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Méthode permettant de récupérer l'instance de la classe Connection utilisée

	public Connection getConnexion() {
		return this.cn;
	}

	/**
	 * methode permettant de se déconnecter de la base de données MySQL
	 */
	public void deconnexionBDD() {
		try {
			cn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
