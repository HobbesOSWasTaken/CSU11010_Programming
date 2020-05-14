package Tutorial_16;

public class Person {

    private String firstName;
    private String lastName;
    private String address;
    protected int id;

    public Person() {}
    public Person(String firstName, String lastName, String address, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.id = id;
    }

    public void display() {
        System.out.printf("First Name: %s%nLast Name: %s%nAddress: %s%nID: %s%n", firstName, lastName, address, id);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }
}
