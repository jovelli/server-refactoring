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

    public String statement() {
        String result = "Rental Record for " + getName() + "\n";

        for (Rental rental: rentals) {
            result += rental.getMovie().getTitle() + "\tprice=" + String.valueOf(rental.getCharge()) + "\n";
        }

        result += "\nAmount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned: " + String.valueOf(getFrequentRenterPoints());

        return result;
    }

    private int getFrequentRenterPoints() {
        int result = 0;

        for (Rental rental: rentals) {
            result += rental.getFrequentRenterPoints();
        }

        return result;
    }

    private double getTotalCharge() {
        double result = 0;

        for (Rental rental: rentals) {
                result += rental.getCharge();
        }

        return result;
    }
}