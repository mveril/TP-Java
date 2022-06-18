package ValidationDesAcquis.POO.TP10;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        System.out.println("Example 1");
        var tirelire = new Tirelire();
        for (int i = 1; i <= 2; i++) {
            tirelire.afficher();
        }
        tirelire.remplir(550.0 );
        tirelire.secouer();
        tirelire.afficher();
        tirelire.puiser(15);
        var inp = new Scanner(System.in);
        System.out.print("Donnez le budget de vos vacances : ");
        var budget = inp.nextDouble();
        var soldeApresVacances = tirelire.calculerSolde(budget);
        if (soldeApresVacances > 0){
            System.out.printf("Vous êtes assez riche pour partir en vacances ! il vous restera %.1f € à la rentré\n", soldeApresVacances);
        } else {
            System.out.printf("Il vous manque %.1f euros pour partir en vacances !\n",soldeApresVacances*-1);
        }
    }
}
