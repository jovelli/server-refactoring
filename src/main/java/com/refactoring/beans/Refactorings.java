package com.refactoring.examples;

import com.refactoring.beans.Price;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Refactorings {

    private static final Logger LOGGER = LogManager.getLogger(Refactorings.class);
    private String name = "John";
    private static List<Price> locations = new ArrayList();
    private int quantity = 10;
    private double itemPrice =  15.0;

    {
        locations.add(Price.createRegular());
        locations.add(Price.createRegular());
        locations.add(Price.createChildren());
        locations.add(Price.createNewRelease());
    }

    public void printOwing(double amount) {
        printBanner();
        double outstanding = getOutstanding(amount * 1.3);
        printDetails(outstanding);

        LOGGER.info("getPrice: " + getPrice());
    }

    private double getPrice() {
        return getBasePrice() * getDiscountFactor();
    }

    private double getDiscountFactor() {
        return ( getBasePrice() > 1000 ) ? .95 : .98;
    }

    private double getOutstanding(double outstanding) {
        for (Price p: locations) {
            outstanding += p.getCharge(3);
        }
        return outstanding;
    }

    private void printDetails(double outstanding) {
        LOGGER.info("Name: " + name);
        LOGGER.info("Amount: " + outstanding);
    }

    private void printBanner() {
        LOGGER.info("******************************");
        LOGGER.info("*********Customer Owes********");
        LOGGER.info("******************************");
    }

    public void getComplicatedPrice() {
        LOGGER.info("getComplicatedPrice " + (getBasePrice() - getQuantityDiscount() + getShipping()));
    }

    private double getBasePrice() { return quantity * itemPrice; }

    private double getShipping() { return Math.min(getBasePrice() * 0.1, 100); }

    private double getQuantityDiscount() { return Math.max(0, quantity - 500) * itemPrice * 0.05; }

}
