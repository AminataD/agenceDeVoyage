package Domaine;
import java.util.ArrayList;

public class Voyage 
{

	private boolean statut;
	public double prix;
	public int numeroVoyage;
	
    private Destination destinationVoyage;
    private ArrayList <Reservation> listeReservations;
    private Formule formule;
    
    public Voyage() {}

	public Voyage(boolean statut, double prix, int numeroVoyage, Destination destinationVoyage, Formule formule) 
	{

		this.statut = statut;
		this.prix = prix;
		this.numeroVoyage = numeroVoyage;
		this.destinationVoyage = destinationVoyage;
		this.formule = formule;
	}
	
	public void addReservation (Reservation reservation)
	{
		
	}
    
    

   
}