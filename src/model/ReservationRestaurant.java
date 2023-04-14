package model;

public class ReservationRestaurant extends Reservation{
	private int numeroService;
	private int numeroTable;

	public ReservationRestaurant(int jour, int mois, int numeroService, int numeroTable) {
		super(jour, mois);
		this.numeroService = numeroService;
		this.numeroTable = numeroTable;
	}


	@Override
	public String toString() {
		if (numeroService==1) {
			return super.toString()+"table n°"+numeroTable+" pour le premier service.\n";
		}
		if(numeroService==2) {
			return super.toString()+"table n°"+numeroTable+" pour le deuxième service.\n";
		}
		return super.toString()+"table n°"+numeroTable+" pour le "+numeroService+" service.\n";
			
	}
	

	
}