package ValidationDesAcquis;

import java.util.Scanner;

public class TPUtils {
    public static int[] declareArrayKeyboard(Scanner scanner) {
        return TPUtils.declareArrayKeyboard(scanner,"Entrez une taille de tableau : ","Entrez la valeur pour T[%d] : ");
    }

    public static int[] declareArrayKeyboard(Scanner scanner, String textlength, String textI) {
        int length;
        do {
            System.out.printf(textlength);
            length = scanner.nextInt();
        } while (length <= 0);
        var array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.printf(textI, i);
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
