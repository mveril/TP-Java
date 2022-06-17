package ValidationDesAcquis;

import java.util.Arrays;

public class TP7 {
    public static char[] alternateCase(char[] array){
        var result = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 ==0) {
                result[i] = Character.toLowerCase(array[i]);
            } else {
                result[i] =  Character.toUpperCase(array[i]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        var array = new char[] {'a', 'b', 'c', 'd', 'e'};
        System.out.println(Arrays.toString(array));
        var alternateArray = alternateCase(array);
        System.out.println(Arrays.toString(alternateArray));
    }
}
