package com.refactoring.examples.datavaluetoobject;

import java.util.HashSet;
import java.util.Set;

public class Order {

    private static final Set<Order> orders = new HashSet();

    private static final String[] customerNames = {"Lea", "Louis", "John", "Mary", "Jerry", "Leopold", "Chei", "Peter", "Daisy", "Donald"};

    static {
        for (int i=0; i<100; i++) {
            orders.add(new Order(customerNames[(int)(Math.random() * 10)]));
        }
    }

    public Order(String customerName) {
        this.customer = Customer.create(customerName);
    }

    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public int getOrdersQtyByCustomer() {
        int result = 0;

        for (Order order: orders) {
            if (order.getCustomer().equals(this.customer))
                result += 1;
        }

        return result;
    }
}
