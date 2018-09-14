package fr.gtm.proxibanquev2.domaine;

public class Conseiller {

	private int idConseiller;
	private String login;
	private String password;
	private Client clientConseiller;

	// Constructeur de la classe Conseiller

	public Conseiller(int idConseiller, String login, String password, Client clientConseiller) {
		super();
		this.idConseiller = idConseiller;
		this.login = login;
		this.password = password;
		this.clientConseiller = clientConseiller;
	}

	// Surchagre 1 constructeur de la classe Conseiller

	public Conseiller(int idConseiller, String login, String password) {
		super();
		this.idConseiller = idConseiller;
		this.login = login;
		this.password = password;
	}

	// Surchagre 2 constructeur de la classe Conseiller

	public Conseiller() {
		super();
	}

	// Getters et Setters classe Conseiller

	public int getIdConseiller() {
		return idConseiller;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public Client getClientConseiller() {
		return clientConseiller;
	}

	public void setIdConseiller(int idConseiller) {
		this.idConseiller = idConseiller;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setClientConseiller(Client clientConseiller) {
		this.clientConseiller = clientConseiller;
	}

	// Méthode metiers de classe Conseiller
	
	/////////////
	////////////////
	////////////////
	////////////////
	////////////////
	////////////////
	////////////////

	@Override
	public String toString() {
		return "Conseiller [idConseiller=" + idConseiller + ", login=" + login + ", password=" + password
				+ ", clientConseiller=" + clientConseiller + "]";
	}

}
