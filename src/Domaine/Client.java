package Domaine;

public class Client extends Personne 
{
	 public MoyenPaiement moyenPaiement;
	 public Reservation reservation;
	 private Facture facture; 
	 public boolean assure; 
	 
	 private String userName = "Client1";
	 private String password = "MyPassword";
	 
    public Client() {}

	public Client(Adresse adresse, String civilite, String nom, String prenom, String email, MoyenPaiement moyenPaiement, Reservation reservation, Facture facture) 
	{
		super(adresse, civilite, nom, prenom, email);
		this.moyenPaiement = moyenPaiement;
		this.reservation = reservation;
		this.facture = facture;
	}

	
	
	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Facture getFacture() 
	{
		return facture;
	}

	public void setFacture(Facture facture) 
	{
		this.facture = facture;
	}
	
	public boolean authentification (String username, String password)
	{
		return this.userName.equals(username) && this.password.equals(password);
	}
	
	
}