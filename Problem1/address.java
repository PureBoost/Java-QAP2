package Problem1;

public class address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String toString() {
        return this.street + ", " + this.city + ", " + this.state + " " + this.zip;
    }
}
