package Domaine;

public class Chambre 
{
	public String typeChambre; 
	public double prixChambre; 
	public PrestationHebergement prestation;
	
    public Chambre() {}

	public Chambre(String typeChambre, double prixChambre, PrestationHebergement prestation) 
	{
		this.typeChambre = typeChambre;
		this.prixChambre = prixChambre;
		this.prestation = prestation;
	}
    
    
}