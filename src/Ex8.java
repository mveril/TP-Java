import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("a : ");
        var a=input.nextDouble();
        System.out.print("b : ");
        var b =input.nextDouble();
        System.out.print("c : ");
        var c=input.nextDouble();
        var delta=Math.pow(b,2)-4*a*c;
        if (delta < 0){
            System.out.println("Il n'y a pas de solution");
        }
        else if (delta == 0)
        {
            System.out.printf("La solution est %.5f\n", -b/2*a);
        }
        else
        {
            System.out.printf("Les solutions sont %.5f et %.5f\n",(-b-Math.sqrt(delta))/2*a,(-b+Math.sqrt(delta))/2*a);
        }
    }
}
