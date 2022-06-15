package POO.Ex3;

public class Patient {
    private String firstName;
    private String lastName;
    private float height;
    private float weight;

    public Patient(String firstName, String lastName,float height, float weight){
        this.firstName=firstName;
        this.lastName=lastName;
        this.height = height;
        this.weight = weight;
    }

    public Patient(String firstName, String lastName){
        this(firstName,lastName,1.60f,50.0f);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float iMC(){
        return (float)(weight/Math.pow(height,2));
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }
    @Override
    public String toString() {
        return fullName();
    }
}
