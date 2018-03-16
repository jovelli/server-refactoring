package com.refactoring.beans;

import java.util.List;
import java.util.ArrayList;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        this.rentals.add(rental);
    }

    public String getName() {
        return this.name;
    }

    public String textStatement() {
        return new TextStatement().value(this);
    }

    public String htmlStatement() {
        return new HtmlStatement().value(this);
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public int getFrequentRenterPoints() {
        int result = 0;

        for (Rental rental: rentals) {
            result += rental.getFrequentRenterPoints();
        }

        return result;
    }

    public double getTotalCharge() {
        double result = 0;

        for (Rental rental: rentals) {
                result += rental.getCharge();
        }

        return result;
    }

}