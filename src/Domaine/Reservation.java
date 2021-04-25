package Domaine;

import java.util.*;

import service.AgenceVoyagesServices;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Reservation 
{

	private int numReservation;
	private ArrayList <Voyageur> listeVoyageurs;
	private EtatReservation etatReservation;
	public Client  client;
    public Assurance assurance;
    public Voyage voyage;
    private double prixReservation;
	
	public Reservation() 
	{
		this.listeVoyageurs = new ArrayList <Voyageur>();
	}
		
	public Reservation(int numReservation, ArrayList<Voyageur> listeVoyageurs, EtatReservation etatReservation,
			Client client, Assurance assurance, Voyage voyage) 
	{
		this.numReservation = numReservation;
		this.listeVoyageurs = new ArrayList <Voyageur>();
		this.etatReservation = etatReservation;
		this.client = client;
		this.assurance = assurance;
		this.voyage = voyage;
	}



	public void add(Voyageur voyageur)
	{
		this.listeVoyageurs.add(voyageur);
	}
	
	public void reserver (Client client)
	{
		Scanner sc = new Scanner (System.in);
		//proposer catalogue des offres de voyages 
		AgenceVoyagesServices agence = new AgenceVoyagesServices();
        for(Voyage v: agence.getOffres()) 
        {
           v.toString();
        }
        int numVoyage = sc.nextInt();
        for(Voyage v: agence.getOffres()) {
           if(v.numeroVoyage == numVoyage){
              this.voyage = v;
           }
        }
				
		boolean authentifie = false; 
		int nbTentatives = 0;
		while (authentifie == false && nbTentatives < 5)
		{
			System.out.println ("Introduisez votre identificateur et votre mot de passe");
			authentifie = client.authentification(sc.next(), sc.next());
			nbTentatives++;
		}
		
		if (authentifie == true)
		{
			this.etatReservation = EtatReservation.EnCours;
			System.out.println ("Quel est le nombre de voyageurs?");
			int nbVoyageurs = sc.nextInt();
			int i= 0;
			while (i < nbVoyageurs)
			{
				Voyageur voyageur = new Voyageur (sc.nextInt(),sc.nextInt(), this);
				this.listeVoyageurs.add(voyageur);
			}
			System.out.println ("A quel type d'assurance voulez-vous souscrire?");
			System.out.println ("1.Annulation");
			System.out.println ("2. Autre");
			
			int typeAssurance = sc.nextInt() ;
			
			if (typeAssurance == 1)
			{
				Contrat contrat = new Contrat (); 
				assurance = new Assurance (100, contrat, this);				
			}
			this.prixReservation = this.assurance.prixAssurance*nbVoyageurs;
			
			System.out.println("Choisissez le mode de paiement: 1- CB 2- Cheque");
	        int mode = sc.nextInt();
	        if(mode == 1)
	         {
	            CB cb = new CB();
	            /*if( Date.valueOf(cb.getDateExpiration()).compareTo(new Date(System.currentTimeMillis())) > 0)
	             {
	               //Vérifier le solde
	               //Contacter la banque
	               //payer(cb, prixTotal)
	               this.etatReservation = EtatReservation.Acceptee;
	​
	             }
	            else
	            {
	               this.etatReservation = EtatReservation.Refusee;
	            }*/
	         }   
			
		}
		
		else new Exception ("Authorisation obligatoire");
	}
   

}