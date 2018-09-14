package fr.gtm.proxibanquev2.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.gtm.proxibanquev2.domaine.CompteBanque;
/**
 * @author Lyes, Kuru, Renata
 *
 */
public class CompteBanqueDao {

	// Attributs

	Statement st;
	ResultSet rs;
	Connection cn;

	public CompteBanqueDao(Connection cn) {
		this.cn = cn;
	}

	public CompteBanque getCompteBanqueById(int idCompteBanque) {

		System.out.println("RECUPERATION D'UN COMPTE DONT L'IDENTIFIANT EST:" + idCompteBanque);

		try {
			String requete = " SELECT * from compte WHERE id = " + idCompteBanque;
			st = this.cn.createStatement();
			rs = st.executeQuery(requete);
			CompteBanque compteBanque = new CompteBanque();
			while (rs.next()) {
				compteBanque.setIdCompteBanque(rs.getInt("idCompteBanque"));
				compteBanque.setNumeroCompte(rs.getString("numeroCompte"));
				compteBanque.setCompteCourant(rs.getString("compteCourant"));
				compteBanque.setCompteEpargne(rs.getString("compteEpargne"));
				compteBanque.setSoldeCompteCourant(rs.getFloat("soldeCompteCourant"));
				compteBanque.setSoldeCompteEpargne(rs.getFloat("soldeCompteEpargne"));
				
			}
			return compteBanque;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean updateCompteBanque(CompteBanque compteBanque) {
		System.out.println("MISE A JOUR D'UN CLIENT" + compteBanque);
		try {
			String requete = "UPDATE compte SET" + " numeroCompte = '" + compteBanque.getCompteCourant() + "'," + " soldeCompteCourant = '"
					+ compteBanque.getSoldeCompteCourant() + " soldeCompteEpargne = '" + compteBanque.getSoldeCompteEpargne() +" compteCourant = '" 
					+ compteBanque.getCompteCourant() + " compteEpargne = '" + compteBanque.getCompteEpargne() +" WHERE id = " + compteBanque.getIdCompteBanque();

			st = this.cn.createStatement();
			st.executeUpdate(requete);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public ArrayList<CompteBanque> getAllCompteBanques() { 
		try {
			String requete = "SELECT * FROM `compteBanque`";
			st = cn.createStatement();
			rs = st.executeQuery(requete);
			ArrayList<CompteBanque> maListeCompteBanques = new ArrayList<CompteBanque>();
			CompteBanque compteBanque ;
			while (rs.next()) {
				compteBanque = new CompteBanque();
				compteBanque.setIdCompteBanque(rs.getInt("idCompteBanque"));
				compteBanque.setNumeroCompte(rs.getString("numeroCompte"));
				compteBanque.setCompteCourant(rs.getString("compteCourant"));
				compteBanque.setCompteEpargne(rs.getString("compteEpargne"));
				compteBanque.setSoldeCompteCourant(rs.getFloat("soldeCompteCourant"));
				compteBanque.setSoldeCompteEpargne(rs.getFloat("soldeCompteEpargne"));
				
				
				maListeCompteBanques.add(compteBanque);
			}
			return maListeCompteBanques;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}

