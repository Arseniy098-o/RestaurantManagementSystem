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


    public void createOrder() {
        System.out.println("Початок методу createOrder()");
        System.out.println("Кінець методу createOrder()");
    }


    public void changeOrder() {
        System.out.println("Початок методу changeOrder()");
        System.out.println("Кінець методу changeOrder()");
    }


    public void checkStatus() {
        System.out.println("Початок методу checkStatus()");
        System.out.println("Кінець методу checkStatus()");
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