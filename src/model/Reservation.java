package model;

public abstract class Reservation {
	private int jour;
	private int mois;
	
	public Reservation(int jour,int mois) {
		this.jour=jour;
		this.mois=mois;
	}

public class ReservationHotel extends Reservation {
	
    private int nbLitSimple;
    private int nbLitDouble;
    private int numeroChambre;
	

public ReservationHotel(int jour, int mois, int nbLitSimple, int nbLitDouble, int numeroChambre) {
	super(jour,mois);
	this.nbLitSimple = nbLitSimple;
	this.nbLitDouble = nbLitDouble;
	this.numeroChambre = numeroChambre;
	}
}

public class ReservationRestaurant extends Reservation{
	private int numeroService;
	private int numeroTable;

	public ReservationRestaurant(int jour, int mois, int numeroService, int numeroTable) {
		super(jour, mois);
		this.numeroService = numeroService;
		this.numeroTable = numeroTable;
	}
	
}

public class ReservationSpectacle extends Reservation {
	    private int numeroZone;
	    private int numeroChaise;
	    
	    public ReservationSpectacle(int jour, int mois, int numeroZone, int numeroChaise) {
	        super(jour, mois);
	        this.numeroZone = numeroZone;
	        this.numeroChaise = numeroChaise;
	    }
	    
}

@Override
public String toString() {
	return "Le"+jour+"/"+mois+ " : table n °1 pour le deuxième service\n";
}



}



