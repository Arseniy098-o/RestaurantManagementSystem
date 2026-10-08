package restaurant;
public class RestaurantManager {
    public void demonstrate(Employee employee, Client client, RestaurantTable table) {
        showEmployeePosition(employee);
        showClientPhone(client);
        showTableStatus(table);
    }


    void showEmployeePosition(Employee employee) {
        System.out.println("Посада працівника: " + employee.getPosition());
    }


    void showClientPhone(Client client) {
        System.out.println("Телефон клієнта: " + client.getPhone());
    }


    void showTableStatus(RestaurantTable table) {
        System.out.println("Статус столика: " + table.getStatus());
    }
}