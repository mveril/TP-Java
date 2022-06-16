package POO.Ex4;

public class Voiture extends Veicule {
    public Voiture(short annee, float prix) {
        super(annee, prix);
    }

    @Override
    public void demarrer() {
        System.out.printf("Je démarre la voiture");
    }

    @Override
    public void accelerer() {
        System.out.printf("J'appuie sur la pédale d'accélérateur de la voiture");
    }
}
