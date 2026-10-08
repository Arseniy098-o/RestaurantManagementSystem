package restaurant;
public class Reservation { private int id; private Client client; private RestaurantTable table; private String date; private String time; private int guests; private String status;
    public Reservation(int id, Client client, RestaurantTable table,
                       String date, String time, int guests, String status) {
        this.id = id;
        this.client = client;
        this.table = table;
        this.date = date;
        this.time = time;
        this.guests = guests;
        this.status = status;
    }


    public int getId() {
        return id;
    }


    public Client getClient() {
        return client;
    }


    public RestaurantTable getTable() {
        return table;
    }


    public String getDate() {
        return date;
    }


    public String getTime() {
        return time;
    }


    public int getGuests() {
        return guests;
    }


    public String getStatus() {
        return status;
    }


    public void createReservation() {
        status = "Підтверджено";
        table.reserve();
        System.out.println("Бронювання створено.");
    }


    public void cancelReservation() {
        status = "Скасовано";
        table.release();
        System.out.println("Бронювання скасовано.");
    }


    public void changeGuests(int newGuests) {
        if (newGuests > 0 && newGuests <= table.getSeats()) {
            guests = newGuests;
        }
    }


    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", client=" + client +
                ", table=" + table +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", guests=" + guests +
                ", status='" + status + '\'' +
                '}';
    }
}