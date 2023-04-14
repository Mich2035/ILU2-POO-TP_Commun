package model;

public abstract class Reservation {
	private int jour;
	private int mois;
	
	public Reservation(int jour,int mois) {
		this.jour=jour;
		this.mois=mois;
	}





public int getJour() {
		return jour;
	}





	public void setJour(int jour) {
		this.jour = jour;
	}





	public int getMois() {
		return mois;
	}





	public void setMois(int mois) {
		this.mois = mois;
	}





@Override
public String toString() {
	return "Le "+jour+"/"+mois+" : ";
}



}



