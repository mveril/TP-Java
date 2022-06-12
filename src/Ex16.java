import java.util.Arrays;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        int[] arr;
        var inp = new Scanner(System.in);
        // Ecriture
        System.out.println("Entrer la taille du tableau");
        arr=new int[inp.nextInt()];
        for (int i = 0; i <= arr.length-1; i++) {
            arr[i]=inp.nextInt();
        }
        var searchedValue=inp.nextInt();
        // Lecture
        var count=0;
        for (var item:arr) {
            if (item== searchedValue){
                count++;
            }
        }
    }
}
