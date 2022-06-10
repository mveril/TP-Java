import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        var inp = new Scanner(System.in);
        System.out.println("Inscription");
        System.out.print("Entrer une adresse email : ");
        var emailInscr = inp.nextLine();
        System.out.print("Entrer un mot de passe : ");
        var pwdInscr = inp.nextLine();
        System.out.println();
        System.out.println("Connection");
        while (true) {
            System.out.println("Email :");
            var email = inp.nextLine();
            System.out.println("Mots de passe :");
            var pwd = inp.nextLine();

            if (email.equals(emailInscr) && pwd.equals(pwdInscr)) {
                System.out.println("Bienvenue sur votre session !");
                break;
            }
            System.out.println("Email ou mot de passe incorrect ! Veuillez réessayer");
        }
    }
}
