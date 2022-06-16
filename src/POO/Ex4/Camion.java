package POO.Ex4;

public class Camion extends Vehicule {
    public Camion(short annee, float prix) {
        super(annee, prix);
    }

    @Override
    public void demarrer() {
        System.out.println("Je démarre le camion");
    }

    @Override
    public void accelerer() {
        System.out.println("J'appuie sur la pédale d'accélérateur du camion");
    }
}
