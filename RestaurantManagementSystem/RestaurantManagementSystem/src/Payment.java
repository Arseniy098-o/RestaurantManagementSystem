package restaurant;
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


    public int getId() {
        return id;
    }


    public Order getOrder() {
        return order;
    }


    public double getAmount() {
        return amount;
    }


    public String getDate() {
        return date;
    }


    public String getPaymentMethod() {
        return paymentMethod;
    }


    public String getStatus() {
        return status;
    }


    public void recordPayment() {
        status = "Оплачено";
        System.out.println("Оплату успішно проведено.");
    }


    public void changePaymentMethod(String newPaymentMethod) {
        paymentMethod = newPaymentMethod;
    }


    public void checkPaymentStatus() {
        System.out.println("Статус оплати: " + status);
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