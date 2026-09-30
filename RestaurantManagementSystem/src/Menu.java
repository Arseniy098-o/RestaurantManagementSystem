import java.util.List;
public class Menu { private int id; private String name; private List<Dish> dishes; private String updateDate;
    public Menu(int id, String name, List<Dish> dishes, String updateDate) {
        this.id = id;
        this.name = name;
        this.dishes = dishes;
        this.updateDate = updateDate;
    }


    public void addDish() {
        System.out.println("Початок методу addDish()");
        System.out.println("Кінець методу addDish()");
    }


    public void changeDish() {
        System.out.println("Початок методу changeDish()");
        System.out.println("Кінець методу changeDish()");
    }


    public void showDishes() {
        System.out.println("Початок методу showDishes()");
        System.out.println("Кінець методу showDishes()");
    }


    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dishes=" + dishes +
                ", updateDate='" + updateDate + '\'' +
                '}';
    }
}