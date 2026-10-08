package restaurant;
public class RestaurantTable { private int id; private int number; private int seats; private String status;
    public RestaurantTable(int id, int number, int seats, String status) {
        this.id = id;
        this.number = number;
        this.seats = seats;
        this.status = status;
    }


    public int getId() {
        return id;
    }


    public int getNumber() {
        return number;
    }


    public int getSeats() {
        return seats;
    }


    public String getStatus() {
        return status;
    }


    public boolean isAvailable() {
        return status.equals("Вільний");
    }


    public void reserve() {
        status = "Заброньований";
        System.out.println("Столик заброньовано.");
    }


    public void release() {
        status = "Вільний";
        System.out.println("Столик звільнено.");
    }


    public void checkAvailability() {
        System.out.println("Початок методу checkAvailability()");
        System.out.println("Столик " + number + ": " + status);
        System.out.println("Кінець методу checkAvailability()");
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