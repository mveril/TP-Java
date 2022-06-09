import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        System.out.println("Table de multiplication");
        var inp=new Scanner(System.in);
        System.out.print("Depuis la table de :");
        var firstTable=inp.nextByte();
        System.out.print("A la table de :");
        var lastTable=inp.nextByte();
        System.out.print("Partir de :");
        var start=inp.nextByte();
        System.out.print("Jusqu'a :");
        var end=inp.nextByte();
        for(byte table=firstTable;table<=lastTable;table++){
            System.out.println();
            System.out.println();
            System.out.printf("Table de %d :\n",table);
            for(byte i=start;i<=end;i++){
                System.out.printf("%d X %d = %d\n",table,i,table*i);
            }
        }
    }
}
