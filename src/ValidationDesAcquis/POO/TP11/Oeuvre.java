package ValidationDesAcquis.POO.TP11;

import java.util.Objects;

public final class Oeuvre implements Affichable {
    private String titre;
    private final Auteur auteur;
    private String langue;

    public Oeuvre(String titre, Auteur auteur, String langue) {
        this.titre = titre;
        this.auteur = auteur;
        this.langue = langue;
    }

    public Oeuvre(String titre, Auteur auteur) {
        this(titre,auteur,"français");
    }

    public String getTitre() {
        return titre;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public String getLangue() {
        return langue;
    }


    @Override
    public String toString() {
        return String.format("%s, %s, en %s",titre, auteur.getNom(), langue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oeuvre oeuvre = (Oeuvre) o;
        return titre.equals(oeuvre.titre) && auteur.equals(oeuvre.auteur) && langue.equals(oeuvre.langue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titre, auteur, langue);
    }
}
