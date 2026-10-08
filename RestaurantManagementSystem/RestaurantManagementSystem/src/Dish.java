package restaurant;
public class Dish { private int id; private String name; private String description; private double price; private String category;
    public Dish(int id, String name, String description,
                double price, String category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }


    public double getPrice() {
        return price;
    }


    public String getCategory() {
        return category;
    }


    public void changePrice(double newPrice) {
        if (newPrice >= 0) {
            price = newPrice;
        }
    }


    public void showInformation() {
        System.out.println("Страва: " + name);
        System.out.println("Опис: " + description);
        System.out.println("Ціна: " + price);
        System.out.println("Категорія: " + category);
    }


    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}