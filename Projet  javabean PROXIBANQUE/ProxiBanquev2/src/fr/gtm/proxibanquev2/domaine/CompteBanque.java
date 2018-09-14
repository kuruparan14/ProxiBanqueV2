package fr.gtm.proxibanquev2.domaine;

public class CompteBanque {

	private String numeroCompte;
	private float soldeCompteCourant;
	private float soldeCompteEpargne;
	private String compteCourant;
	private String compteEpargne;
	private int idCompteBanque;
	private Client clientCompte;

	// Constructeur de la classe Client

	public CompteBanque(String numeroCompte, float soldeCompteCourant, float soldeCompteEpargne, String compteCourant,
			String compteEpargne, int idCompteBanque, Client clientCompte) {
		super();
		this.numeroCompte = numeroCompte;
		this.soldeCompteCourant = soldeCompteCourant;
		this.soldeCompteEpargne = soldeCompteEpargne;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
		this.idCompteBanque = idCompteBanque;
		this.clientCompte = clientCompte;
	}

	// Surcharge1 constructeur de la classe Client
	public CompteBanque(String numeroCompte, float soldeCompteCourant, float soldeCompteEpargne, String compteCourant,
			String compteEpargne, int idCompteBanque) {
		super();
		this.numeroCompte = numeroCompte;
		this.soldeCompteCourant = soldeCompteCourant;
		this.soldeCompteEpargne = soldeCompteEpargne;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
		this.idCompteBanque = idCompteBanque;
	}

	// Surcharge2 constructeur de la classe Client

	public CompteBanque(String numeroCompte, float soldeCompteCourant, float soldeCompteEpargne, String compteCourant,
			String compteEpargne) {
		super();
		this.numeroCompte = numeroCompte;
		this.soldeCompteCourant = soldeCompteCourant;
		this.soldeCompteEpargne = soldeCompteEpargne;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
	}

	// Surcharge3 constructeur de la classe Client

	public CompteBanque(String numeroCompte, float soldeCompteCourant, float soldeCompteEpargne, String compteCourant) {
		super();
		this.numeroCompte = numeroCompte;
		this.soldeCompteCourant = soldeCompteCourant;
		this.soldeCompteEpargne = soldeCompteEpargne;
		this.compteCourant = compteCourant;
	}

	// Surcharge4 constructeur de la classe Client

	public CompteBanque(String numeroCompte, float soldeCompteCourant, float soldeCompteEpargne) {
		super();
		this.numeroCompte = numeroCompte;
		this.soldeCompteCourant = soldeCompteCourant;
		this.soldeCompteEpargne = soldeCompteEpargne;
	}

	// Surcharge5 constructeur de la classe Client

	public CompteBanque(String numeroCompte, float soldeCompteCourant) {
		super();
		this.numeroCompte = numeroCompte;
		this.soldeCompteCourant = soldeCompteCourant;
	}

	// Surcharge6 constructeur de la classe Client

	public CompteBanque(String numeroCompte) {
		super();
		this.numeroCompte = numeroCompte;
	}

	// Surcharge7 constructeur de la classe Client

	public CompteBanque() {
		super();
	}

	// Getters et Setters classe Client

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public float getSoldeCompteCourant() {
		return soldeCompteCourant;
	}

	public void setSoldeCompteCourant(float soldeCompteCourant) {
		this.soldeCompteCourant = soldeCompteCourant;
	}

	public float getSoldeCompteEpargne() {
		return soldeCompteEpargne;
	}

	public void setSoldeCompteEpargne(float soldeCompteEpargne) {
		this.soldeCompteEpargne = soldeCompteEpargne;
	}

	public String getCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(String compteCourant) {
		this.compteCourant = compteCourant;
	}

	public String getCompteEpargne() {
		return compteEpargne;
	}

	public void setCompteEpargne(String compteEpargne) {
		this.compteEpargne = compteEpargne;
	}

	public int getIdCompteBanque() {
		return idCompteBanque;
	}

	public void setIdCompteBanque(int idCompteBanque) {
		this.idCompteBanque = idCompteBanque;
	}

	public Client getClientCompte() {
		return clientCompte;
	}

	public void setClientCompte(Client clientCompte) {
		this.clientCompte = clientCompte;
	}

	@Override
	public String toString() {
		return "CompteBanque [numeroCompte=" + numeroCompte + ", soldeCompteCourant=" + soldeCompteCourant
				+ ", soldeCompteEpargne=" + soldeCompteEpargne + ", compteCourant=" + compteCourant + ", compteEpargne="
				+ compteEpargne + ", idCompteBanque=" + idCompteBanque + ", clientCompte=" + clientCompte
				+ ", getNumeroCompte()=" + getNumeroCompte() + ", getSoldeCompteCourant()=" + getSoldeCompteCourant()
				+ ", getSoldeCompteEpargne()=" + getSoldeCompteEpargne() + ", getCompteCourant()=" + getCompteCourant()
				+ ", getCompteEpargne()=" + getCompteEpargne() + ", getIdCompteBanque()=" + getIdCompteBanque()
				+ ", getClientCompte()=" + getClientCompte() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}