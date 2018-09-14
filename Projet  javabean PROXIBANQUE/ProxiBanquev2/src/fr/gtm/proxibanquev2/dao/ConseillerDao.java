package fr.gtm.proxibanquev2.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.gtm.proxibanquev2.domaine.Conseiller;
/**
 * @author Lyes, Kuru, Renata
 *
 */
public class ConseillerDao {

	// Attributs

	Statement st;
	ResultSet rs;
	Connection cn;

	public ConseillerDao(Connection cn) {
		this.cn = cn;
	}

	public Conseiller getConseillerByLogin(String login) {

		System.out.println("RECUPERATION D'UN CONSEILLER A PARTIR D'UN CLIENT:" + login);

		try {
			String requete = " SELECT * from conseiller WHERE idClient = " + login;
			st = this.cn.createStatement();
			rs = st.executeQuery(requete);
			Conseiller conseiller = new Conseiller();
			while (rs.next()) {
				conseiller.setIdConseiller(rs.getInt("idConseiller"));
				conseiller.setLogin(rs.getString("login"));
				conseiller.setPassword(rs.getString("password"));


			}
			return conseiller;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
