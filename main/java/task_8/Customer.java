package task_8;

import java.util.UUID;

public class Customer {
    UUID customerID;
    String name;

    public Customer(String name) {
        this.name = name;
        this.customerID = UUID.randomUUID();
    }
}
