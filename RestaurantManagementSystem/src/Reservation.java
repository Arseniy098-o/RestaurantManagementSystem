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


    public void createReservation() {
        System.out.println("Початок методу createReservation()");
        System.out.println("Кінець методу createReservation()");
    }


    public void cancelReservation() {
        System.out.println("Початок методу cancelReservation()");
        System.out.println("Кінець методу cancelReservation()");
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