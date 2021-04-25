package Domaine;


public abstract class Personne 
{

	private Adresse adresse;
    private String civilite;
    private String nom;
    private String prenom;
    private String email;
    
    public Personne() {}

	public Personne(Adresse adresse, String civilite, String nom, String prenom, String email) 
	{
		this.adresse = adresse;
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
  

}