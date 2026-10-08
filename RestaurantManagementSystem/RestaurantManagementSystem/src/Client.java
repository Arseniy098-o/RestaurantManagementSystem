package restaurant;
public class Client { private int id; private String firstName; private String lastName; private String phone;
    public Client(int id, String firstName, String lastName, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
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


    public void changePhone(String newPhone) {
        phone = newPhone;
    }


    public void createOrder() {
        System.out.println("Початок методу createOrder()");
        System.out.println("Кінець методу createOrder()");
    }


    public void reserveTable() {
        System.out.println("Початок методу reserveTable()");
        System.out.println("Кінець методу reserveTable()");
    }


    public void makePayment() {
        System.out.println("Початок методу makePayment()");
        System.out.println("Кінець методу makePayment()");
    }


    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}