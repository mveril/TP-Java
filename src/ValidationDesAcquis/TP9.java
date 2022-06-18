package ValidationDesAcquis;

import java.util.Scanner;

public class TP9 {
    public static boolean containsIdentical(String str){
        if (str.length()<2){
            return false;
        }
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i)==str.charAt(i+1)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        var inp = new Scanner(System.in);
        System.out.print("Entrer un texte : ");
        var text = inp.nextLine();
        var test = containsIdentical(text);
        System.out.print("Le texte ");
        if (test){
            System.out.println("contiens des caractères que se répètes");
        }
        else {
            System.out.println("ne contiens pas de caractère que se répète");
        }
    }
}
