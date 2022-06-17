package ValidationDesAcquis;

import java.util.Arrays;

public class TP7 {
    public static char[] alternateCase(char[] array){
        var arrayCopy = Arrays.copyOf(array,array.length);
        for (int i = 0; i < array.length; i++) {
            if (i % 2 ==0) {
                TPUtils.toLowerCharArray(arrayCopy,i);
            } else {
                TPUtils.toUpperCharArray(arrayCopy,i);
            }
        }
        return arrayCopy;
    }
    public static void main(String[] args) {
        var array = new char[] {'a', 'b', 'c', 'd', 'e'};
        System.out.println(Arrays.toString(array));
        var alternateArray = alternateCase(array);
        System.out.println(Arrays.toString(alternateArray));
    }
}
