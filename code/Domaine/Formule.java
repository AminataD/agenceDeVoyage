package Domaine;
import java.util.ArrayList;

public class Formule 
{
    private double prixTotalFormule;
    private ArrayList <Prestation> listePrestations;
    
    public Formule() {}

	public double getPrixTotalFormule() 
	{
		return prixTotalFormule;
	}

	public void setPrixTotalFormule(double prixTotalFormule) 
	{
		this.prixTotalFormule = prixTotalFormule;
	}

	public ArrayList<Prestation> getListePrestations() 
	{
		return listePrestations;
	}

	public void setListePrestations(ArrayList<Prestation> listePrestations) 
	{
		this.listePrestations = listePrestations;
	}
	
	
    

}