import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        var inp = new Scanner(System.in);
        System.out.printf("Entrer une chaine à inverser :");
        var str=inp.nextLine();
        //var builder = new StringBuilder();
        var newStr="";
        for (int i = str.length() -1; i >=0 ; i--) {
            //builder.append(str.charAt(i));
            newStr+=str.charAt(i);
        }
        //System.out.println(builder.toString());
        System.out.println(newStr);
    }
}
