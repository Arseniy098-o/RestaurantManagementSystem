package restaurant;
public class Employee { private int id; private String firstName; private String lastName; private String phone; private String position;
    public Employee(int id, String firstName, String lastName, String phone, String position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.position = position;
    }


    public int getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public String getPhone() {
        return phone;
    }


    public String getPosition() {
        return position;
    }


    public void changePosition(String newPosition) {
        position = newPosition;
    }


    public void acceptOrder() {
        System.out.println("Початок методу acceptOrder()");
        System.out.println("Кінець методу acceptOrder()");
    }


    public void serveClient() {
        System.out.println("Початок методу serveClient()");
        System.out.println("Кінець методу serveClient()");
    }


    public void processPayment() {
        System.out.println("Початок методу processPayment()");
        System.out.println("Кінець методу processPayment()");
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}