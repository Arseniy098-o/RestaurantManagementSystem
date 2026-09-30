public class Supplier { private int id; private String name; private String contactPerson; private String phone; private String address;
    public Supplier(int id, String name, String contactPerson,
                    String phone, String address) {
        this.id = id;
        this.name = name;
        this.contactPerson = contactPerson;
        this.phone = phone;
        this.address = address;
    }


    public void supplyProducts() {
        System.out.println("Початок методу supplyProducts()");
        System.out.println("Кінець методу supplyProducts()");
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