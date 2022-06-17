package ValidationDesAcquis;

import java.util.Scanner;

public class TP4 {


    public static void main(String[] args) {
        var inp = new Scanner(System.in);
        System.out.print("Entrer une phrase : ");
        var str = inp.nextLine();
        var arrayStr = str.toCharArray();
        for (int i = 0; i < str.length()-1; i++) {
           if (i==0){
               TPUtils.toUpperCharArray(arrayStr,i);
           }
           if (arrayStr[i]==' '){
               TPUtils.toUpperCharArray(arrayStr,i+1);
           }
        }
        var newStr = new String(arrayStr);
        System.out.printf("Le résultat est :\n%s",newStr);
    }

}
