package ValidationDesAcquis.POO.TP11;

import java.util.Objects;

public final class Auteur {
    private String nom;
    private boolean prix;

    public Auteur(String nom, boolean prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public Auteur(String nom){
        this(nom,false);
    }

    public String getNom() {
        return nom;
    }

    public boolean getPrix() {
        return prix;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auteur auteur = (Auteur) o;
        return prix == auteur.prix && nom.equals(auteur.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prix);
    }
}
