package POO.Ex2;

public class Person {
    public Person(String firstName, String lastName, String country, boolean isMarred, byte numberOfChild){
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.married = isMarred;
        this.numberOfChildren = numberOfChild;
    }

    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private boolean married;

    public boolean isMarried() {
        return married;
    }

    public void setIsMarried(boolean married) {
        married = married;
    }

    private byte numberOfChildren;

    public byte getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(byte numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    String fullName(){
        return  String.format("%s %s" , firstName, lastName);
    }
}
