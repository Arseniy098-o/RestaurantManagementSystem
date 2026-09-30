public class Product { private int id; private String name; private double quantity; private String unit; private String expirationDate;
    public Product(int id, String name, double quantity,
                   String unit, String expirationDate) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.expirationDate = expirationDate;
    }


    public void checkQuantity() {
        System.out.println("Початок методу checkQuantity()");
        System.out.println("Кінець методу checkQuantity()");
    }


    public void checkExpirationDate() {
        System.out.println("Початок методу checkExpirationDate()");
        System.out.println("Кінець методу checkExpirationDate()");
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unit='" + unit + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}