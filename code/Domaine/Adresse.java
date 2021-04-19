package Domaine;

public class Adresse 
{
	
	public String codePostal;
	public String ville; 
	public int numeroRue; 
	public String rue; 
	public String pays; 
    
	public Adresse(String codePostal, String ville, int numeroRue, String rue, String pays) 
	{
		this.codePostal = codePostal;
		this.ville = ville;
		this.numeroRue = numeroRue;
		this.rue = rue;
		this.pays = pays;
	}

}