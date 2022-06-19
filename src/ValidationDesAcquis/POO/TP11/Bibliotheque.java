package ValidationDesAcquis.POO.TP11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public final class Bibliotheque implements Iterable<Exemplaire> {
    private String nom;
    private ArrayList<Exemplaire> exemplaires;

    public Bibliotheque(String nom) {
        this.nom = nom;
        exemplaires = new ArrayList<>();
        System.out.printf("La bibliothèque %s est ouverte\n",nom);
    }

    public String getNom() {
        return nom;
    }

    public int getNbExemplaires(){
        return exemplaires.size();
    }

    public void stocker(Oeuvre oeuvre){
        exemplaires.add(new Exemplaire(oeuvre));
    }

    public void stocker(Oeuvre oeuvre, int nombre){
        for (int i = 1; i <= nombre ; i++) {
            stocker(oeuvre);
        }
    }

    public ArrayList<Exemplaire> listerExemplaires(){
        return listerExemplaires("");
    }

    public ArrayList<Exemplaire> listerExemplaires(String langue){
        var list = new ArrayList<Exemplaire>();
        for (var exemplaire:this) {
            if (langue.isEmpty() || exemplaire.getOeuvre().getLangue() == langue){
                list.add(exemplaire);
            }
        }
        return list;
    }

    public int compterExemplaires(Oeuvre oeuvre){
        var count = 0;
        for (var exemplaire:this) {
            if (exemplaire.getOeuvre().equals(oeuvre)){
                count++;
            }
        }
        return count;
    }

    public void afficherAuteurs(boolean prix){
        var auteursPrime= new HashSet<Auteur>();
        for (var exemplaire : this) {
            var auteur = exemplaire.getOeuvre().getAuteur();
            if (auteur.hasPrix() || !prix) {
                auteursPrime.add(auteur);
            }
        }
        for (var auteur: auteursPrime) {
            System.out.println(auteur.getNom());
        }
    }

    @Override
    public Iterator<Exemplaire> iterator() {
        return exemplaires.iterator();
    }

    @Override
    public Spliterator<Exemplaire> spliterator() {
        return exemplaires.spliterator();
    }
}
