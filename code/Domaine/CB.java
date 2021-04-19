package Domaine;
import java.time.LocalDate;

public class CB extends MoyenPaiement 
{

    private int dateExpiration;
    private int numeroCB;
    
    public CB() {}

	public CB(int dateExpiration, int numeroCB) 
	{
		this.dateExpiration = dateExpiration;
		this.numeroCB = numeroCB;
	}

	public int getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(int dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	public int getNumeroCB() {
		return numeroCB;
	}

	public void setNumeroCB(int numeroCB) {
		this.numeroCB = numeroCB;
	}


}