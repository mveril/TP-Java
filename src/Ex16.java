import java.util.Arrays;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        int[] arr;
        var inp = new Scanner(System.in);
        // Ecriture
        int arrayLength;
        do {
            System.out.print("Entrer la taille du tableau :");
            arrayLength = inp.nextInt();
        } while (arrayLength < 0);
        arr=new int[arrayLength];
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.printf("Entrer un nombre pour l'indice %d :",i);
            arr[i]=inp.nextInt();
        }
        System.out.print("Entrer un nombre à rechercher :");
        var searchedValue=inp.nextInt();
        // Lecture
        var count=0;
        for (var item:arr) {
            if (item== searchedValue){
                count++;
            }
        }
        if (count>0){
            System.out.printf(">%d existe et se retrouve %d fois dans le tableau\n",searchedValue,count);
        }
        else {
            System.out.printf("%d n'est pas dans le tableau\n",searchedValue);
        }
    }
}
