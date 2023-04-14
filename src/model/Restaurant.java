package model;

public class Restaurant {
	
	CentraleReservation<Table,FormulaireRestaurant> centrale=new CentraleReservation<Table,FormulaireRestaurant>(new EntiteReservable[25]);
	private Table table;
	private class Table extends EntiteReservable<FormulaireRestaurant>{
		private int nbChaises;
		protected CalendrierAnnuel calendrierDeuxièmeService;
		protected CalendrierAnnuel calendrierAnnuel;
		public Table(int nbChaises) {
			this.nbChaises=nbChaises;
			this.calendrierDeuxièmeService=new CalendrierAnnuel();
		}
		public boolean estLibre(FormulaireRestaurant f) {
			if(f.getNumService()==1) {
				
				return calendrierAnnuel.estLibre(f.getJour(),f.getMois());
			}
			else {
				return calendrierDeuxièmeService.estLibre(f.getJour(),f.getMois());
			}
			
		}
		public boolean compatible(FormulaireRestaurant f) {
			int nbpersonne=f.getNombrePersonnes();
			boolean a=((nbpersonne==nbChaises)||nbChaises==nbpersonne+1);
			boolean b=estLibre(f);
			return(a&&b);
			
		}
		public ReservationRestaurant reservation(FormulaireRestaurant f) {
			if (compatible(f)) {
				if (f.getNumService()==1) {
					 calendrierAnnuel.reserver(f.getJour(), f.getMois());
				}
				else {
					calendrierDeuxièmeService.reserver(f.getJour(), f.getMois());
				}
				ReservationRestaurant reservation=new ReservationRestaurant(f.getJour(),f.getMois(),f.getNumService(),f.getIdentificationEntite());
				return reservation;
			}
			else {
				return null;
			}
			
		}
		@Override
		public Reservation reserver(FormulaireRestaurant formulaire) {
			// TODO Auto-generated method stub
			return null;
		}
	}
		public void ajouterTable(int nbChaise) {
			Table table=new Table(nbChaise);
			centrale.ajouterEntite(table);
			
		}
		public int[] donnerPossibilites(FormulaireRestaurant f) {
			return centrale.donnerPossibilites(f);
		}
		public Reservation reserver(int numEntiteReserver,FormulaireRestaurant f) {
			return centrale.reserver(numEntiteReserver, f);
		}
		


		
	}



