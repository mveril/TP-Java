import java.util.Arrays;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        int[] arr;
        var inp = new Scanner(System.in);
        // Ecriture
        System.out.print("Entrer la taille du tableau :");
        arr=new int[inp.nextInt()];
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.printf("Valeur %d :",i);
            arr[i]=inp.nextInt();
        }
        System.out.print("Valeur recherché :");
        var searchedValue=inp.nextInt();
        // Lecture
        var count=0;
        for (var item:arr) {
            if (item== searchedValue){
                count++;
            }
        }
        System.out.printf("La valeur %d apparait %d fois\n3",searchedValue,count);
    }
}
