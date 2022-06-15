package POO.Ex3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        var inp = new Scanner(System.in);
        System.out.print("Nom :");
        var lastName = inp.nextLine();
        System.out.print("Prénom :");
        var firstName = inp.nextLine();
        System.out.print("Taille :");
        var height =  inp.nextFloat();
        System.out.print("Poid :");
        var weight =  inp.nextFloat();
        var patient = new Patient(firstName,lastName,height,weight);
        System.out.printf("Le patient %s mesure %.2f m.\nIl pèse %.2f Kg.\nSon indice de masse corporelle est de %.2f",patient,patient.getHeight(),patient.getWeight(), patient.iMC());
    }
}
