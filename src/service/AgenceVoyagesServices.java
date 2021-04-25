package service;

import java.util.ArrayList;

import Domaine.Voyage;

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
	public boolean reserver(Voyage voyage)
	{
		return true;
	}


}