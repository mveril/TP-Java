package BasesJava;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex14 {
    public static void main(String[] args) {
        var inp = new Scanner(System.in);
        System.out.println("Inscription");
        var emailRegEx= Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        String emailInscr;
        do {
            System.out.print("Entrer une adresse email : ");
            emailInscr =inp.nextLine();
        } while (!emailRegEx.matcher(emailInscr).matches());
        var pwdRegEx= Pattern.compile("^\\d{4}$");
        String pwdInscr;
        do {
            System.out.print("Entrer un mot de passe : ");
            pwdInscr = inp.nextLine();
        } while (!pwdRegEx.matcher(pwdInscr).matches());
        System.out.println();
        System.out.println("Connection");
        for (byte i=4;i>=0;i--)
        {
            System.out.println("Email :");
            var email = inp.nextLine();
            System.out.println("Mots de passe :");
            var pwd = inp.nextLine();

            if (email.equals(emailInscr) && pwd.equals(pwdInscr)) {
                System.out.println("Bienvenue sur votre session !");
                System.exit(0);
            }
            else {
                System.out.printf("Vous avez saisis les mauvais identifiant il vous reste %d essai\n",i);
            }
        }
        System.out.println("Vous avez saisis les mauvais identifiant 5 fois, votre compte est bloqué");
    }
}
