package ValidationDesAcquis;

import java.util.Scanner;

public class TP2 {
    public static void main(String[] args) {
        var inp = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        var nb=inp.nextInt();
        var sign=(int)Math.signum(nb);
        int newNum;
        if (sign==0){
            newNum=nb;
        }
        else {
            var absNb=Math.abs(nb);
            var absNbStr = Integer.toString(absNb);
            // Version boucle
            var sb=new StringBuilder();
            for (int i = absNbStr.length()-1; i >=0 ; i--) {
                sb.append(absNbStr.charAt(i));
            }
            // Version reverse
//            var sb=new StringBuilder(absNbStr);
//            sb.reverse();
            var absInvNb=Integer.parseInt(sb.toString());
            newNum=absInvNb*sign;
        }
        System.out.printf("L'inverse est %d",newNum);
    }
}
