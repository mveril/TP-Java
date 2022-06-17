package ValidationDesAcquis;

import java.util.ArrayList;

public class TP6 {
    public static ArrayList<Integer[]> countArray(int[][] matrix, int n){
        var positions = new ArrayList<Integer[]>();
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == n){
                    positions.add(new Integer[] {i,j});
                }
            }
        }
        return positions;
    }
    public static void main(String[] args) {
        int[][] matrix ={
                {1, 4, 2, 1},
                {6, 3, 8, 9},
                {1, 5, 1, 0}};
        var number =1;
        var result = countArray(matrix,number);
        System.out.printf("La valeur %d se retrouve %d fois dans notre matrice et ses postion sont : \n",number, result.size());
        for (int i = 0; i < result.size(); i++) {
            System.out.printf("(%d,%d)",result.get(i));
        }
    }
}
