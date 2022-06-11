public class Ex4 {
    public static void main(String[] args) {
        int a = 51;
        int b = 276;
        int c = 835;
        System.out.println("Valeurs avans permutation");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        int d;
        d=c;
        c=b;
        b=a;
        a=d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
