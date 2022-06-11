public class Ex1 {
    public static void main(String[] args) {
        byte age=11;
        if(age < 7) {
            System.out.println("Trop jeune");
        } else if (age <= 9){
            System.out.println("Poussin");
        } else if (age <= 11) {
            System.out.println("Pupille");
        } else if (age <= 13) {
            System.out.println("Benjamin");
        }
        else if(age <= 15){
            System.out.println("Minime");
        } else if (age <= 17) {
            System.out.println("Cadet");
        }
        else {
            System.out.println("Trop grand");
        }
    }
}
