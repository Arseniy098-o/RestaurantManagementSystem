package restaurant;
public class Supplier { private int id; private String name; private String contactPerson; private String phone; private String address;
    public Supplier(int id, String name, String contactPerson,
                    String phone, String address) {
        this.id = id;
        this.name = name;
        this.contactPerson = contactPerson;
        this.phone = phone;
        this.address = address;
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getContactPerson() {
        return contactPerson;
    }


    public String getPhone() {
        return phone;
    }


    public String getAddress() {
        return address;
    }


    public void changePhone(String newPhone) {
        phone = newPhone;
    }


    public void changeAddress(String newAddress) {
        address = newAddress;
    }


    public void supplyProducts() {
        System.out.println("Постачальник " + name + " постачає продукти.");
    }


    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}