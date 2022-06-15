package BasesJava;

import java.util.HashMap;
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        var inp = new Scanner(System.in);
        var numWeek = new int[7];
        var nameWeek = new String[7];
//        for (int i = 0; i < 7; i++) {
//            System.out.print("Entrer un numero de jour de semaine :");
//            numWeek[i]=inp.nextInt();
//            System.out.print("Entrer le nom de jour de semaine associé :");
//            nameWeek[i]=inp.nextLine();
//        }

        for (int i = 0; i < 7; i++) {
            System.out.print("Entrer un jour de semaine :");
            var nameDay=inp.nextLine();
            nameWeek[i] = nameDay;
        }

        System.out.println();


        for (int i = 0; i < 7; i++) {
            System.out.printf("Entrer un numero de %s : ",nameWeek[i]);
            var numDay=inp.nextInt();
            numWeek[i] = numDay;
        }

        var weekMap = new HashMap<Integer,String>();
        for (int i = 0; i < 7; i++) {
            weekMap.put(numWeek[i], nameWeek[i]);
        }
        System.out.print("Entrer un numéro de jour de semaine :");
        var key = inp.nextInt();
        var value = weekMap.get(key);
        System.out.printf("Le jour de semaine numéro %d est le %s\n",key,value);
    }

}
