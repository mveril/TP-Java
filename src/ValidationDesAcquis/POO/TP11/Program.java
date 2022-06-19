package ValidationDesAcquis.POO.TP11;

import java.util.HashSet;

public class Program {
    public static void main(String[] args) {
        var bMunicipale = new Bibliotheque("municipale");
        var victor = new Auteur("Victor Hugo");
        var lesMiserable = new Oeuvre("Les Misérable",victor);
        bMunicipale.stocker(lesMiserable,2);
        var hommeQuiRis = new Oeuvre("L'Homme qui rit",victor);
        bMunicipale.stocker(hommeQuiRis);
        var dumas = new Auteur("Alexandre Dumas");
        var montecristo = new Oeuvre("Le Comte de Monte-Cristo",dumas);
        bMunicipale.stocker(montecristo,3);
        var queneau = new Auteur("Raymond Queneau", true);
        var zazie = new Oeuvre("Zazie dans le metro", queneau);
        bMunicipale.stocker(zazie);
        var montecristoEn = new Oeuvre("The count of Monte-Cristo",dumas,"anglais");
        bMunicipale.stocker(montecristoEn);
        System.out.printf("La bibliotheque %s offre\n", bMunicipale.getNom());
        for(var exemplaire : bMunicipale.listerExemplaires()){
            exemplaire.afficher();
        }
        var langue = "anglais";
        System.out.printf("Les exemplaires en %s sont :\n", langue);
        for(var exemplaire : bMunicipale.listerExemplaires(langue)){
            exemplaire.afficher();
        }

        System.out.println("Les auteurs a succès sont");
        bMunicipale.afficherAuteurs(true);
        System.out.printf("Il y a %d exemplaire de %s\n",bMunicipale.compterExemplaires(montecristo),montecristo.getTitre());
    }
}
