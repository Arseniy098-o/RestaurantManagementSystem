package restaurant;
public class Product { private int id; private String name; private double quantity; private String unit; private String expirationDate;
    public Product(int id, String name, double quantity,
                   String unit, String expirationDate) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.expirationDate = expirationDate;
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public double getQuantity() {
        return quantity;
    }


    public String getUnit() {
        return unit;
    }


    public String getExpirationDate() {
        return expirationDate;
    }


    public void addQuantity(double amount) {
        if (amount > 0) {
            quantity += amount;
        }
    }


    public void removeQuantity(double amount) {
        if (amount > 0 && amount <= quantity) {
            quantity -= amount;
        }
    }


    public void checkQuantity() {
        System.out.println("Кількість продукту: " + quantity + " " + unit);
    }


    public void checkExpirationDate() {
        System.out.println("Термін придатності: " + expirationDate);
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