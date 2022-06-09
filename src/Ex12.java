import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        var inp=new Scanner(System.in);
        System.out.print("Les 10 chiffres après : ");
        var n=inp.nextShort();
        for(var i=n+1;i<=n+10;i++){
            System.out.println(i);
        }
    }
}
