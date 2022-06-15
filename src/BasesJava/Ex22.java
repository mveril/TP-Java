package BasesJava;

import java.util.ArrayList;

public class Ex22 {
    public static void main(String[] args) {
        String[] emails = {"christian.lisangola@gmail.com", "jean.paul@gmail.com", "alain@gmail.com", "lydie@yahoo.fr", "josephine.lajoie@yahoo.com", "luise@hotmail.fr", "philemon.turion@gmail.com", "jules.cesar@hotmail.fr" };
        var arraylength = emails.length;
        var count = 0;
        for (int i = 0; i < arraylength; i++) {
            var oneSplit = emails[i].split("@");
            var twoSplit  = oneSplit[1].split("\\.");
            var domain=twoSplit[0];
            if (domain.equals("gmail")){
                count++;
            }
        }
        var percent = ((float)count/(float) arraylength)*100;
        System.out.printf("Le pourcentage d'adresse gmail est de %.0f %%",percent);
    }
}
