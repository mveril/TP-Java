import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Numero du mois : ");
        var mothNumber=input.nextByte();
        String mothName;
        switch(mothNumber) {
            case 1:
                mothName = "Janvier";
                break;
            case 2:
                mothName = "Fevrier";
                break;
            case 3:
                mothName = "Mars";
                break;
            case 4:
                mothName = "Avril";
                break;
            case 5:
                mothName = "Mai";
                break;
            case 6:
                mothName = "Juin";
                break;
            case 7:
                mothName = "Juillet";
                break;
            case 8:
                mothName = "Auout";
                break;
            case 9:
                mothName = "Septembre";
                break;
            case 10:
                mothName = "Octobre";
                break;
            case 11:
                mothName = "Novembre";
                break;
            case 12:
                mothName = "Decembre";
                break;
            default:
                mothName=null;
        }
        if (mothName == null) {
            System.out.print("Mois invalide");
        }
        else {
            System.out.printf("Le mois séléctionné est le mois de %s", mothName);
        }
    }
}
