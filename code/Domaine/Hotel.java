package Domaine;

import java.util.ArrayList;

public class Hotel extends Prestation 
{
	 
	 public int nbEtoiles;
	 public String nomHotel; 

	 public Adresse adresse;
	 public ArrayList <Chambre> listeChambres;
	 	 
    public Hotel() {}

	public Hotel(int nbEtoiles, String nomHotel, Adresse adresse, ArrayList<Chambre> listeChambres) 
	{
		super();
		this.nbEtoiles = nbEtoiles;
		this.nomHotel = nomHotel;
		this.adresse = adresse;
		this.listeChambres = listeChambres;
	}
    
    
    
    





}