public class Dish { private int id; private String name; private String description; private double price; private String category;
    public Dish(int id, String name, String description,
                double price, String category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }


    public void showInformation() {
        System.out.println("Початок методу showInformation()");
        System.out.println("Кінець методу showInformation()");
    }


    public void changePrice() {
        System.out.println("Початок методу changePrice()");
        System.out.println("Кінець методу changePrice()");
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