package fr.gtm.proxibanquev2.domaine;

public class Client {

	private int idClient;
	private String nom;
	private String prenom;
	private String email;
	private String adresse;
	private Conseiller conseillerClient;
	private CompteBanque compteClient;

	// Constructeur de la classe Client

	public Client(int idClient, String nom, String prenom, String email, String adresse, Conseiller conseillerClient,
			CompteBanque compteClient) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.conseillerClient = conseillerClient;
		this.compteClient = compteClient;
	}

	// Surcharge1 constructeur de la classe Client

	public Client(int idClient, String nom, String prenom, String email, String adresse) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
	}
	
	// Surcharge2 constructeur de la classe Client

	public Client(String nom, String prenom, String email, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
	}

	// Surcharge3 constructeur de la classe Client

	public Client() {
		super();
	}

	// Getters et Setters classe Client

	public int getIdClient() {
		return idClient;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getEmail() {
		return email;
	}

	public String getAdresse() {
		return adresse;
	}

	public Conseiller getConseillerClient() {
		return conseillerClient;
	}

	public CompteBanque getCompteClient() {
		return compteClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setConseillerClient(Conseiller conseillerClient) {
		this.conseillerClient = conseillerClient;
	}

	public void setCompteClient(CompteBanque compteClient) {
		this.compteClient = compteClient;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", adresse=" + adresse + ", conseillerClient=" + conseillerClient + ", compteClient=" + compteClient
				+ "]";
	}

}
