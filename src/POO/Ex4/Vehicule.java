package POO.Ex4;

public abstract class Vehicule {
    private int matricule;
    private short annee;
    private float prix;

    private static int sNextMatricule = 0;

    public Vehicule(short annee, float prix) {
        this.matricule = Vehicule.sNextMatricule;
        Vehicule.sNextMatricule++;
        this.annee = annee;
        this.prix = prix;
    }

    public int getMatricule() {
        return matricule;
    }


    public short getAnnee() {
        return annee;
    }

    public void setAnnee(short annee) {
        this.annee = annee;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public abstract void demarrer();
    public abstract void accelerer();

    @Override
    public String toString() {
        return String.format("Véhicule :\nMatricule :%d\nannee : %d\nprix: %.2f",matricule,annee,prix);
    }
}
