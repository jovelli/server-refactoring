package com.refactoring.examples.methodobject;

public class MethodObject {

    double base = 10;

    public double price(double price, int quantity, int year) {
        return new PriceCalculator(this, price, quantity, year).compute();
    }
}
