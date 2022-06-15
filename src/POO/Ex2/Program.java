package POO.Ex2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        var inp = new Scanner(System.in);
        System.out.print("Nom :");
        var lastName = inp.nextLine();
        System.out.print("Prénom :");
        var firstName = inp.nextLine();
        System.out.print("Pays :");
        var pays =  inp.nextLine();
        System.out.print("Marié :");
        var isMarried = inp.nextBoolean();
        System.out.print("Nombre d'enfant :");
        var numberOfChildren = inp.nextByte();
        var user = new Person(firstName,lastName,pays,isMarried,numberOfChildren);
        System.out.printf("L'utilisateur s'appelle : %s\n", user.fullName());
        System.out.printf("L'utilisateur vie en : %s\n", user.getPays() );
        System.out.printf("L'utilisateur à %d enfant\n", user.getNumberOfChildren());
        System.out.printf("L'utilisateur %s marié\n", user.isMarried() ? "est" : "n'est pas");
    }
}
