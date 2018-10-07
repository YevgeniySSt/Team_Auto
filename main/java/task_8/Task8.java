package task_8;

import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Вася");
        Customer customer2 = new Customer("Таня");
        Customer customer3 = new Customer("Андрей");

        Order order1 = new Order(1, "холодильник", customer1);
        Order order2 = new Order(2, "телевизор", customer1);
        Order order3 = new Order(3, "стиралка", customer2);
        Order order4 = new Order(4, "утюг", customer3);

        ArrayList<Order> orders1 = new ArrayList<Order>();
        orders1.add(order1);
        orders1.add(order2);

        ArrayList<Order> orders2 = new ArrayList<Order>();
        orders2.add(order3);

        ArrayList<Order> orders3 = new ArrayList<Order>();
        orders3.add(order4);

        Shipment shipment1 = new Shipment("первое", "Киев", orders1);

        Shipment shipment2 = new Shipment("второе", "Харьков", orders2);

        Shipment shipment3 = new Shipment("третье", "Полтава", orders3);

        Shipment shipment4 = new Shipment("четвертое", "Львов", null);

        shipment1.printShipment();
        shipment2.printShipment();
        shipment3.printShipment();
        shipment4.printShipment();


    }
}
