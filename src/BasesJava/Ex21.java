package BasesJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        var languages=new ArrayList<String>();
        var inp = new Scanner(System.in);
        System.out.println("Entrez des langage de programations");
        while (true){
            var language = inp.nextLine();
            if (language.isBlank()){
               break;
            }
            languages.add(language);
        }
        System.out.println(languages);
        System.out.println("Entrez des langage de programations à effacer");
        while (true) {
            var language = inp.nextLine();
            if (language.isBlank()) {
                break;
            }
            if (!languages.remove(language)){
                System.out.printf("%s n'est pas dans la liste des langages de programation défini\n",language);
            }
        }
        System.out.println(languages);
    }
}
