package POO.Ex1;

public class Person {
    String firstName;
    String lastName;
    String pays;
    boolean isMarried;
    byte numberOfChildrens;

    String fullName(){
        return  String.format("%s %s" , firstName, lastName);
    }
}
