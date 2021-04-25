package Domaine;

public class Facture 
{
	public Client client ; 
    public Reservation reservation;
	
    public Facture() {}

	public Facture(Client client, Reservation reservation) 
	{
		this.client = client;
		this.reservation = reservation;
	}

    


}