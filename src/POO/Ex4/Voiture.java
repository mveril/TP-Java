package POO.Ex4;

public class Voiture extends Vehicule {
    public Voiture(short annee, float prix) {
        super(annee, prix);
    }

    @Override
    public void demarrer() {
        System.out.println("Je démarre la voiture");
    }

    @Override
    public void accelerer() {
        System.out.println("J'appuie sur la pédale d'accélérateur de la voiture");
    }
}
