package model;

public abstract class Formulaire<T> {
    private int jour;
    private int mois;
    private T entiteReservee;
    
    public Formulaire(int jour, int mois, T entiteReservee) {
        this.jour = jour;
        this.mois = mois;
        this.entiteReservee = entiteReservee;
    }
    
    public int getJour() {
        return jour;
    }
    
    public int getMois() {
        return mois;
    }
    
    public T getEntiteReservee() {
        return entiteReservee;
    }
    
    public void setEntiteReservee(T entiteReservee) {
        this.entiteReservee = entiteReservee;
    }


public class FormulaireHotel extends Formulaire<Integer> {
    private int nbLitSimple;
    private int nbLitDouble;
    
    public FormulaireHotel(int jour, int mois, int numChambre, int nbLitSimple, int nbLitDouble) {
        super(jour, mois, numChambre);
        this.nbLitSimple = nbLitSimple;
        this.nbLitDouble = nbLitDouble;
    }
    
    public int getNbLitSimple() {
        return nbLitSimple;
    }
    
    public int getNbLitDouble() {
        return nbLitDouble;
    }
}

public class FormulaireRestaurant extends Formulaire<Integer> {
    private int nbPersonnes;
    private int numService;
    
    public FormulaireRestaurant(int jour, int mois, int numTable, int nbPersonnes, int numService) {
        super(jour, mois, numTable);
        this.nbPersonnes = nbPersonnes;
        this.numService = numService;
    }
    
    public int getNbPersonnes() {
        return nbPersonnes;
    }
    
    public int getNumService() {
        return numService;
    }
}

public class FormulaireSpectacle extends Formulaire<Integer> {
    private int numZone;
    
    public FormulaireSpectacle(int jour, int mois, int numPlace, int numZone) {
        super(jour, mois, numPlace);
        this.numZone = numZone;
    }
    
    public int getNumZone() {
        return numZone;
    }
}
}
