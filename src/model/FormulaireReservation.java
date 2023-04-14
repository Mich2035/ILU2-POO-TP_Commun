package model;

public abstract class FormulaireReservation {
    private int jour;
    private int mois;

    public FormulaireReservation(int jour, int mois) {
        this.jour = jour;
        this.mois = mois;
    }

    public int getJour() {
        return jour;
    }

    public int getMois() {
        return mois;
    }


}
