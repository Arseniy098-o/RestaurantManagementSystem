package restaurant;
import java.util.List;
public class Menu { private int id; private String name; private List<Dish> dishes; private String updateDate;
    public Menu(int id, String name, List<Dish> dishes, String updateDate) {
        this.id = id;
        this.name = name;
        this.dishes = dishes;
        this.updateDate = updateDate;
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public List<Dish> getDishes() {
        return dishes;
    }


    public String getUpdateDate() {
        return updateDate;
    }


    public void addDish(Dish dish) {
        dishes.add(dish);
        System.out.println("Страву додано до меню.");
    }


    public void removeDish(Dish dish) {
        dishes.remove(dish);
        System.out.println("Страву видалено з меню.");
    }


    public void changeDish(Dish oldDish, Dish newDish) {
        int index = dishes.indexOf(oldDish);

        if (index >= 0) {
            dishes.set(index, newDish);
            System.out.println("Страву змінено.");
        }
    }


    public void showDishes() {
        System.out.println("Страви в меню:");

        for (Dish dish : dishes) {
            System.out.println(dish);
        }
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