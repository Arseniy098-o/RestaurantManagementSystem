import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import restaurant.*;
public class Main { public static void main(String[] args) {
    Employee employee = new Employee(
            1,
            "Іван",
            "Петренко",
            "+380501234567",
            "Офіціант"
    );

    Client client = new Client(
            1,
            "Олександр",
            "Іваненко",
            "+380671234567"
    );

    RestaurantTable table = new RestaurantTable(
            1,
            5,
            4,
            "Вільний"
    );

    Dish dish1 = new Dish(
            1,
            "Борщ",
            "Традиційна українська страва",
            120.0,
            "Перші страви"
    );

    Dish dish2 = new Dish(
            2,
            "Цезар",
            "Салат з куркою",
            180.0,
            "Салати"
    );

    Order order = new Order(
            1,
            "30.09.2026",
            "14:30",
            client,
            employee,
            Arrays.asList(dish1, dish2),
            300.0,
            "Створено"
    );

    Menu menu = new Menu(
            1,
            "Основне меню",
            Arrays.asList(dish1, dish2),
            "30.09.2026"
    );

    Payment payment = new Payment(
            1,
            order,
            300.0,
            "30.09.2026",
            "Картка",
            "Оплачено"
    );

    Product product = new Product(
            1,
            "Картопля",
            50.0,
            "кг",
            "15.10.2026"
    );

    Supplier supplier = new Supplier(
            1,
            "ТОВ «Продукт-Сервіс»",
            "Петро Сидоренко",
            "+380631234567",
            "м. Київ, вул. Центральна, 10"
    );

    Reservation reservation = new Reservation(
            1,
            client,
            table,
            "01.10.2026",
            "19:00",
            4,
            "Підтверджено"
    );


    System.out.println(employee);
    System.out.println(client);
    System.out.println(table);
    System.out.println(dish1);
    System.out.println(dish2);
    System.out.println(order);
    System.out.println(menu);
    System.out.println(payment);
    System.out.println(product);
    System.out.println(supplier);
    System.out.println(reservation);


    RestaurantManager manager = new RestaurantManager();

    manager.demonstrate(employee, client, table);

    List<Client> clients = new ArrayList<>();

    clients.add(client);
    clients.add(new Client(
            2,
            "Марія",
            "Коваленко",
            "+380991112233"
    ));

    System.out.println("\nСписок клієнтів:");
    for (Client c : clients) {
        System.out.println(c);
    }
}
}