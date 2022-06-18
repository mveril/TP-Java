package ValidationDesAcquis.POO.TP11;

public class Oeuvre implements Affichable {
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
        return String.format("%s, %s, en %s",titre, auteur, langue);
    }
}
