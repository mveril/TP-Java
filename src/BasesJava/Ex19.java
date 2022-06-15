package BasesJava;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        var inp = new Scanner(System.in);
        // Ecriture
        for (int i = 0; i <= matrix.length-1; i++) {
            for (int j = 0; j <= matrix[i].length-1; j++) {
                System.out.printf("Entrer la valeur de M[%d,%d] :",i,j);
                matrix[i][j]=inp.nextInt();
            }
        }
        for (int i = 0; i <matrix.length; i++) {
            boolean printSpaceBefore=false;
            for (int j = 0; j < matrix[i].length; j++) {
                if (printSpaceBefore) {
                    System.out.print(" ");
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        var sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum+=matrix[i][i];
        }
        System.out.printf("La somme de la diagonale est de : %s", sum);
    }
}
