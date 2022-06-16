package POO.Ex4;

public class Test {
    public static void main(String[] args) {
        var camion1= new Camion((short) 2010,100_000);
        System.out.println(camion1);
        camion1.demarrer();
        camion1.accelerer();
        var voiture1= new Voiture((short) 2020,50_000);
        System.out.println(voiture1);
        voiture1.demarrer();
        voiture1.accelerer();
    }
}
