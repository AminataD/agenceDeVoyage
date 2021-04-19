package Domaine;

public class Assurance 
{

    public double prixAssurance; 
    public Contrat contrat; 
    public Reservation reservation;
    
    public Assurance() {}

	public Assurance(double prixAssurance, Contrat contrat, Reservation reservation) 
	{
		this.prixAssurance = prixAssurance;
		this.contrat = contrat;
		this.reservation = reservation;
	}
    

}