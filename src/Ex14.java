import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        var inp = new Scanner(System.in);
        System.out.println("Inscription");
        System.out.print("Entrer une adresse email : ");
        var emailInscr = inp.nextLine();
        System.out.print("Entrer un mot de passe : ");
        var pwdInscr = inp.nextLine();
        System.out.println();
        System.out.println("Connection");
        for (byte i=1;i<=5;i++)
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
                System.out.printf("Vous avez saisis les mauvais identifiant %d fois\n",i);
            }
        }
        System.out.println("Il reste 0 tentative, votre compte est bloqué");
    }
}