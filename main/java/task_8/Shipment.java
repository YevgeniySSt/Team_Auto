package task_8;

import java.util.ArrayList;

public class Shipment {
    String shipmentID;
    String address;
    ArrayList<Order> list = new ArrayList<Order>();

    public Shipment(String shipmentID, String address, ArrayList<Order> orders) {
        this.shipmentID = shipmentID;
        this.address = address;
        this.list = orders;
    }

    public void printShipment() {
        System.out.println("Shipment ID: " + shipmentID + ", adddress: ");
        if (list == null) {
            System.out.println("no orders");
        } else {
            for (Order order : list) {
                System.out.println("  Order ID: " + order.orderID + ", Type: " + order.type + ", Customer" + order.customer.name);
                System.out.println("");
            }
        }

    }
}
