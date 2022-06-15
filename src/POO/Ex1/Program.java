package POO.Ex1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        var inp = new Scanner(System.in);
        var user = new Person();
        System.out.print("Nom :");
        user.lastName = inp.nextLine();
        System.out.print("Prénom :");
        user.firstName = inp.nextLine();
        System.out.print("Pays :");
        user.pays =  inp.nextLine();
        System.out.print("Marié :");
        user.isMarried = inp.nextBoolean();
        System.out.print("Nombre d'enfant :");
        user.numberOfChildren = inp.nextByte();
        System.out.printf("L'utilisateur s'appelle : %s\n", user.fullName() );
        System.out.printf("L'utilisateur vie en : %s\n", user.pays );
        System.out.printf("L'utilisateur à %d enfant\n", user.numberOfChildren);
        System.out.printf("L'utilisateur %s marié\n", user.isMarried ? "est" : "n'est pas");
    }
}
