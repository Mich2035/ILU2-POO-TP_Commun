package model;

public class FormulaireRestaurant extends Formulaire {
    private int nombrePersonnes;
    private int numService;
    
    public FormulaireRestaurant(int jour, int mois, int nbPersonnes, int numService) {
        super(jour, mois);
        this.nombrePersonnes = nbPersonnes;
        this.numService = numService;
    }
    
    public int getNombrePersonnes() {
        return nombrePersonnes;
    }
    
    public int getNumService() {
        return numService;
    }
}
