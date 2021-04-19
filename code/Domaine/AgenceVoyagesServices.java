package Domaine;

import java.util.ArrayList;

public class AgenceVoyagesServices 
{

	public String nomAgence; 
	private ArrayList <Voyage> listVoyages;
	
	
    public AgenceVoyagesServices() {}


	public AgenceVoyagesServices(String nomAgence) 
	{
		this.nomAgence = nomAgence;
		this.listVoyages = new ArrayList<Voyage>();
	}
	
	public ArrayList<Voyage> getOffres()
	{
		return this.listVoyages;
	}


}