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

}
