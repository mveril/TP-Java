import java.util.ArrayList;
import java.util.HashMap;

public class Ex22HashMap {
    public static void main(String[] args) {
        var map =new HashMap<String,ArrayList<String>>();
        String[] emails = {"christian.lisangola@gmail.com", "jean.paul@gmail.com", "alain@gmail.com", "lydie@yahoo.fr", "josephine.lajoie@yahoo.com", "luise@hotmail.fr", "philemon.turion@gmail.com", "jules.cesar@hotmail.fr" };
        var arraylength = emails.length;
        for (int i = 0; i < arraylength; i++) {
            var oneSplit = emails[i].split("@");
            var twoSplit  = oneSplit[1].split("\\.");
            var domain=twoSplit[0];
            if (map.containsKey(domain)){
                map.get(domain).add(emails[i]);
            }
            else {
                map.put(domain,new ArrayList<String>());
            }
        }
        var keys = map.keySet().toArray();
        for (int i = 0; i < keys.length; i++) {
            var key = keys[i];
            var percent = ((float)map.get(key).size()/(float) arraylength)*100;
            System.out.printf("Le pourcentage d'adresse %s est de %.0f %%\n",key,percent);
        }
    }
}
