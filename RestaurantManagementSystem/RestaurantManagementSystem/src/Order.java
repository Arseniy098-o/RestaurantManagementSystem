package restaurant;
import java.util.List;
public class Order { private int id; private String date; private String time; private Client client; private Employee employee; private List<Dish> dishes; private double amount; private String status;
    public Order(int id, String date, String time, Client client,
                 Employee employee, List<Dish> dishes,
                 double amount, String status) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.client = client;
        this.employee = employee;
        this.dishes = dishes;
        this.amount = amount;
        this.status = status;
    }


    public int getId() {
        return id;
    }


    public String getDate() {
        return date;
    }


    public String getTime() {
        return time;
    }


    public Client getClient() {
        return client;
    }


    public Employee getEmployee() {
        return employee;
    }


    public List<Dish> getDishes() {
        return dishes;
    }


    public double getAmount() {
        return amount;
    }


    public String getStatus() {
        return status;
    }


    public void addDish(Dish dish) {
        dishes.add(dish);
        calculateAmount();
    }


    public void removeDish(Dish dish) {
        dishes.remove(dish);
        calculateAmount();
    }


    public void calculateAmount() {
        amount = 0;

        for (Dish dish : dishes) {
            amount += dish.getPrice();
        }
    }


    public void changeStatus(String newStatus) {
        status = newStatus;
    }


    public void createOrder() {
        System.out.println("Початок методу createOrder()");
        System.out.println("Кінець методу createOrder()");
    }


    public void changeOrder() {
        System.out.println("Початок методу changeOrder()");
        System.out.println("Кінець методу changeOrder()");
    }


    public void checkStatus() {
        System.out.println("Статус замовлення: " + status);
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", client=" + client +
                ", employee=" + employee +
                ", dishes=" + dishes +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}