package ValidationDesAcquis.POO.TP11;

public interface Affichable {
     default void afficher() {
        System.out.println(this);
    }
}
