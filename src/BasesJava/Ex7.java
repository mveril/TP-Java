package BasesJava;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Entrer un nombre :");
        var number= input.nextInt();
        var isPair = (number % 2) == 0;
        String stringSign;
        if (number>0){
            stringSign= "positif";
        } else if (number<0){
            stringSign ="négatif";
        } else {
            stringSign= "égal a 0";
        }
        System.out.printf("Le nombre est %s est il est %s", stringSign, isPair ? "pair" :  "impair" );
    }
}
