package com.refactoring.examples.datavaluetoobject;

import java.util.HashMap;
import java.util.Map;

public class Customer {

    private String name;
    private static final Map<String, Customer> customers = new HashMap();

    public static Customer create(String name) {
        Customer customer = null;

        if (customers.containsKey(name)) {
            customer = customers.get(name);
        } else {
            customer = new Customer(name);
            customers.put(name, customer);
        }

        return customer;
    }

    private Customer(String name) {
        this.name = name;
    }
}
