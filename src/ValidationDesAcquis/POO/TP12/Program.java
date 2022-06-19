package ValidationDesAcquis.POO.TP12;

import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
       var souris = new Souris[3];
       souris[0] = new Souris(50,"blanche");
       souris[1] = new Souris(45,"grise");
       souris[2] = new Souris(souris[1]);
       for (int i = 1; i <= 2 ; i++) {
           souris[0].vieillir();
       }
       for (var maSouris: souris ) {
           System.out.println(maSouris);
       }
       var newAges = new HashMap<Souris,Integer>();
       newAges.put(souris[0],36);
       newAges.put(souris[1],36);
       newAges.put(souris[2],28);
        for (var sourisAge: newAges.entrySet()) {
            var maSouris = sourisAge.getKey();
            var newAge = sourisAge.getValue();
            for (int i = maSouris.getAge(); i < newAge; i++) {
                maSouris.vieillir();
            }
            System.out.println(maSouris);
        }
    }
}
