package com.refactoring.examples.parameterbymethod;

public class Price {

    private double itemPrice;
    private int quantity;

    public Price(double itemPrice, int quantity) {
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    public double getPrice() {
        return discountedPrice();
    }

    private double getBasePrice() {
        return this.itemPrice * this.quantity;
    }

    private int getDiscount() {
        return (quantity > 100) ? 2 : 1;
    }

    private double discountedPrice() {
        return (getDiscount() == 2) ? getBasePrice() * 0.1 : getBasePrice() * 0.05;
    }
}
