package ValidationDesAcquis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TP5 {
    public static void main(String[] args) {
        System.out.println("Entrer une phrase");
        var inp = new Scanner(System.in);
        var string = inp.nextLine();
        var hmap =new HashMap<Character,Integer>();
        var charArray = new ArrayList<Character>();
        int currentCharCount=0;
        for (int i = 1; i < string.length(); i++) {
            var current = string.charAt(i);
            var previous = string.charAt(i-1);
            if (current == previous){
                currentCharCount++;
            }
            else {
                if (currentCharCount>1){
                    var key = current;
                    if (hmap.containsKey(key)) {
                        var val =hmap.get(key);
                        val+=currentCharCount;
                        hmap.replace(key,val);
                    } else {
                        hmap.put(key, 1);
                    }
                }
                currentCharCount = 1;
                charArray.add(string.charAt(i));
            }
        }
        System.out.println(string);
        System.out.println(charArray);
        System.out.println(hmap);
    }
}
