public class Person {
    private String firstName, lastName, address;

    public Person (String fName, String lName, String addr) {
        firstName = fName;
        lastName = lName;
        address = addr;
    }

    public String getFirstName () {
        return firstName;
    }
    public String getLastName () {
        return lastName;
    }
    public String getAddress () {
        return address;
    }

    public void setFirstName (String newInput) {
        firstName = newInput;
    }
    public void setLastName (String newInput) {
        lastName = newInput;
    }
    public void setAddress (String newInput) {
        address = newInput;
    }
}