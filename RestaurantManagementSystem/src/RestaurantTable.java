public class RestaurantTable { private int id; private int number; private int seats; private String status;
    public RestaurantTable(int id, int number, int seats, String status) {
        this.id = id;
        this.number = number;
        this.seats = seats;
        this.status = status;
    }


    public void checkAvailability() {
        System.out.println("Початок методу checkAvailability()");
        System.out.println("Кінець методу checkAvailability()");
    }


    public void reserve() {
        System.out.println("Початок методу reserve()");
        System.out.println("Кінець методу reserve()");
    }


    @Override
    public String toString() {
        return "RestaurantTable{" +
                "id=" + id +
                ", number=" + number +
                ", seats=" + seats +
                ", status='" + status + '\'' +
                '}';
    }
}