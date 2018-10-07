package task_8;

public class Order {
    public static int orders = 0;
    int orderID;
    int number;
    String type;
    Customer customer;

    public Order(int number, String type, Customer customer) {
        this.number = number;
        this.type = type;
        this.customer = customer;
        Order.orders++;
        this.orderID = Order.orders;
    }
}
