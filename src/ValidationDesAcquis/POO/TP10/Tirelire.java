package ValidationDesAcquis.POO.TP10;

public class Tirelire {
    private double montant;

    public Tirelire(double montant) {
        this.montant = montant;
    }

    public Tirelire() {

    }

    public double getMontant() {
        return montant;
    }
    public void afficher(){
        if (montant == 0){
            System.out.println("Vous êtes sans le sou.");
        } else {
            System.out.printf("Vous avez : %.1f € dans votre tirelire.\n",montant);
        }
    }

    public void secouer(){
        if (montant>0){
            System.out.println("Bing bing");
            System.out.println();
        }
    }

    public void remplir(double montant){
        if (montant>0){
            this.montant+=montant;
        }
    }

    public void vider(){
        montant=0;
    }

    public void puiser(double montant){
        if (montant>0){
           this.montant = Math.max(0, this.montant-montant);
        }
    }

    public double calculerSolde(double budjet){
        if (budjet<0){
            budjet=0;
        }
        return montant-budjet;
    }
}
