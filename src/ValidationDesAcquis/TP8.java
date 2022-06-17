package ValidationDesAcquis;

import java.util.Arrays;

public class TP8 {
    public static int[] walkToDirection(String[] directions){
        var position = new int[] {0, 0};
        for (int i = 0; i < directions.length; i++) {
            var direction =directions[i];
            switch (direction){
                case "haut":
                    position[1]++;
                    break;
                case "bas":
                    position[1]--;
                    break;
                case "gauche":
                    position[0]--;
                    break;
                case "droite":
                    position[0]++;
                    break;
            }
        }
        return position;
    }
    public static void main(String[] args) {
        var array= new String[] {"haut", "haut", "bas", "gauche", "gauche", "droite", "haut"};
        System.out.println(Arrays.toString(walkToDirection(array)));
    }
}
