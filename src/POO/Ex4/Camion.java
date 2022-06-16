package POO.Ex4;

public class Camion extends Veicule {
    public Camion(short annee, float prix) {
        super(annee, prix);
    }

    @Override
    public void demarrer() {
        System.out.print("Je démarre le camion");
    }

    @Override
    public void accelerer() {
        System.out.printf("J'appuie sur la pédale d'accélérateur du camion");
    }
}
