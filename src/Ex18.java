import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        var inp = new Scanner(System.in);
        System.out.printf("Entrer une chaine de caractère à tester :");
        var str=inp.nextLine();
        var builder = new StringBuilder();
        for (int i = str.length() -1; i >=0 ; i--) {
            builder.append(str.charAt(i));
        }
        if (builder.toString().equals(str)){
            System.out.printf("Le mot %s est un palindrome !\n", str);
        } else {
            System.out.printf("Le mot %s n'est pas un palindrome.\n", str);
        }

    }
}
