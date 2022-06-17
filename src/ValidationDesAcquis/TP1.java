package ValidationDesAcquis;


import java.lang.reflect.Array;
import java.util.Scanner;

public class TP1 {
    public static void main(String[] args) {
        var inp= new Scanner(System.in);
        var array= TPUtils.declareArrayKeyboard(inp);
        int maxPos = 0;
        int minPos = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i]>array[maxPos]){
                maxPos=i;
            }
            if (array[i]<array[minPos]){
                minPos=i;
            }
        }
        var sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i==minPos){
                sb.append("(PP)");
            }
            if (i==maxPos){
                sb.append("(PG)");
            }
            if (i!=array.length-1){
                sb.append(',');
            }
        }
        sb.append(']');
        System.out.println(sb);
    }
}