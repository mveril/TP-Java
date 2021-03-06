package BasesJava;

import java.util.Arrays;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        var arr = new int[3][];
        var inp = new Scanner(System.in);
        // Ecriture
        for (int i = 0; i <= arr.length-1; i++) {
            int arrayLength;
            do {
                System.out.printf("Entrer la taille du tableau %d :",i+1);
                arrayLength = inp.nextInt();
            } while (arrayLength < 0);
            arr[i]=new int[arrayLength];
            for (int j = 0; j <= arr[i].length-1; j++) {
                System.out.printf("Entrer les vaueurs du tableau %d :\n",i+1);
                System.out.printf("T%d[%d]",i+1,j);
                arr[i][j]=inp.nextInt();
            }
        }

        // Lecture
        var sum=0;
        System.out.println();
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.printf("Le tableau numero %d contient :\n%s\n",i, Arrays.toString(arr[i]));
        }
        boolean showPlus = false;
        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = 0; j <= arr[i].length-1; j++) {
                var v=arr[i][j];
                if (v % 3 == 0){
                    if (showPlus)
                    {
                        System.out.print(" + ");
                    }
                    showPlus = true;
                    System.out.print(v);
                    sum+=v;
                }
            }
        }
        if (sum!=0) {
            System.out.printf(" = %d", sum);
        }
    }
}
