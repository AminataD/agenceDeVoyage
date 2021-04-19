package Domaine;

public class Voyageur extends Personne 
{
	
    private int IDcard;
    private int ageVoyageur; 
    private Reservation reservation;
    
    public Voyageur() {}

	public Voyageur(Adresse adresse, String civilite, String nom, String prenom, String email,int iDcard, int ageVoyageur, Reservation reservation) 
	{
		super(adresse, civilite, nom, prenom, email);
		IDcard = iDcard;
		this.ageVoyageur = ageVoyageur;
		this.reservation = reservation;
	}

	public Voyageur(int iDcard, int ageVoyageur, Reservation reservation) 
	{
		IDcard = iDcard;
		this.ageVoyageur = ageVoyageur;
		this.reservation = reservation;
	}

	public int getIDcard() {
		return IDcard;
	}

	public void setIDcard(int iDcard) {
		IDcard = iDcard;
	}

	public int getAgeVoyageur() {
		return ageVoyageur;
	}

	public void setAgeVoyageur(int ageVoyageur) {
		this.ageVoyageur = ageVoyageur;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

    

}