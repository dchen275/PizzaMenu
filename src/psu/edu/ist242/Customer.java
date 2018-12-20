package psu.edu.ist242;

//Customer Info
public class Customer {
    private static String custFirstName;
    private static String custLastName;
    private static String streetName;

    public static String getCustFirstName() {
        return custFirstName;
    }
    public void setCustFirstName(String custFirstName) {
        this.custFirstName = custFirstName;
    }
    public String getCustLastName() {
        return custLastName;
    }
    public void setCustLastName(String custLastName) {
        this.custLastName = custLastName;
    }
    public String getStreetName() {
        return streetName;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Customer (String _custFirstName, String _custLastName, String _streetName){
        this.custFirstName = _custFirstName;
        this.custLastName = _custLastName;
        this.streetName = _streetName;
    }
}
