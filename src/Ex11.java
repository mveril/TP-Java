import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        var inp=new Scanner(System.in);
        System.out.println("Factoriel de :");
        var n=inp.nextShort();
        long result=1;
        if(n==0)
        {
            System.out.println(result);
        }
        else if(n<0)
        {
            System.out.println("La valeur doit étre positive");
        }
        else{
            for (short i=1;i<=n;i++)
            {
                result = i*result;
            }
            System.out.println(result);
        }
    }
}
