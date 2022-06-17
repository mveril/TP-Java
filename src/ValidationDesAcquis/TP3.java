package ValidationDesAcquis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TP3 {
    public static void main(String[] args) {
        var inp=new Scanner(System.in);
        System.out.println("Entrez deux chaines de caractères pour tester si ce sont des anagrammes");
        var strings=new String[2];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = inp.nextLine();
        }
        var hashMaps = new ArrayList<HashMap<Character,Integer>>();
        hashMaps.add(new HashMap<>());
        hashMaps.add(new HashMap<>());
        for (int i = 0; i < strings.length; i++) {
            var string = strings[i];
            var hmap = hashMaps.get(i);
            for (int j = 0; j < string.length(); j++) {
                var c = string.charAt(j);
                var key = Character.toLowerCase(c);
                if (Character.isLetterOrDigit(key)){
                    if (hmap.containsKey(key)) {
                        var val =hmap.get(key);
                        val++;
                        hmap.replace(key,val);
                    } else {
                        hmap.put(key, 1);
                    }
                }
            }
        }
        System.out.printf("Les mots %s et %s %s des anagrammes",strings[0],strings[1],hashMaps.get(0).equals(hashMaps.get(1)) ? "sont" : "ne sont pas");
    }
}
