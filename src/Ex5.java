// Used to get the current year
import java.util.Calendar;

public class Ex5 {
    public static void main(String[] args) {
        byte age =28;
        // Get the current year
        short currYear = (short) (Calendar.getInstance().get(Calendar.YEAR));
        short yearOfBirth = (short) (currYear - age);
        System.out.println("Votre année de naissance est : " + yearOfBirth);
    }
}
