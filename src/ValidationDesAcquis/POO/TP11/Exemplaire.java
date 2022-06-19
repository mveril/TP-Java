package ValidationDesAcquis.POO.TP11;

public final class Exemplaire implements Cloneable, Affichable {
    private final Oeuvre oeuvre;

    public Exemplaire(Oeuvre oeuvre) {
        this.oeuvre = oeuvre;
        System.out.printf("Nouvel exemplaire -> %s\n", oeuvre);
    }

    public Exemplaire(Exemplaire exemplaire) {
        oeuvre =exemplaire.oeuvre;
        System.out.printf("Copie d’un exemplaire de %s\n", exemplaire);
    }

    public Oeuvre getOeuvre() {
        return oeuvre;
    }

    @Override
    protected Object clone() {
        return new Exemplaire(this);
    }

    @Override
    public String toString() {
        return String.format("Un exemplaire de %s",this.oeuvre);
    }
}
