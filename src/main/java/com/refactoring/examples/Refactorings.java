package com.refactoring.examples;

import com.refactoring.beans.ChildrensPrice;
import com.refactoring.beans.NewReleasePrice;
import com.refactoring.beans.Price;
import com.refactoring.beans.RegularPrice;

import java.util.ArrayList;
import java.util.List;

public class Refactorings {

    private String name = "John";
    private static List<Price> locations = new ArrayList();
    private int quantity = 10;
    private double itemPrice =  15.0;

    {
        locations.add(new RegularPrice());
        locations.add(new RegularPrice());
        locations.add(new ChildrensPrice());
        locations.add(new NewReleasePrice());
    }

    public void printOwing(double amount) {
        printBanner();
        double outstanding = getOutstanding(amount * 1.3);
        printDetails(outstanding);

        System.out.println("getPrice: " + getPrice());
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
        System.out.println("Name: " + name);
        System.out.println("Amount: " + outstanding);
    }

    private void printBanner() {
        System.out.println("******************************");
        System.out.println("*********Customer Owes********");
        System.out.println("******************************");
    }

    public void getComplicatedPrice() {
        System.out.println("getCompicatePrice " + (getBasePrice() - getQuantityDiscount() + getShipping()));
    }

    private double getBasePrice() { return quantity * itemPrice; }

    private double getShipping() { return Math.min(getBasePrice() * 0.1, 100); }

    private double getQuantityDiscount() { return Math.max(0, quantity - 500) * itemPrice * 0.05; }

}
