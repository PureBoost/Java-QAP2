package JavaQap2.Problem1;

public class person {
    private String lastName;
    private String firstName;
    private address home;

    public person(String lastName, String firstName, address home) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = home;
    }
    
    public String toString() {
        return "Person: " + this.firstName + " " + this.lastName + ", Home: " + this.home;
    }

}
