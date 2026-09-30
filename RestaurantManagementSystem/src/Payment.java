public class Payment { private int id; private Order order; private double amount; private String date; private String paymentMethod; private String status;
    public Payment(int id, Order order, double amount,
                   String date, String paymentMethod, String status) {
        this.id = id;
        this.order = order;
        this.amount = amount;
        this.date = date;
        this.paymentMethod = paymentMethod;
        this.status = status;
    }


    public void recordPayment() {
        System.out.println("Початок методу recordPayment()");
        System.out.println("Кінець методу recordPayment()");
    }


    public void checkPaymentStatus() {
        System.out.println("Початок методу checkPaymentStatus()");
        System.out.println("Кінець методу checkPaymentStatus()");
    }


    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", order=" + order +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}