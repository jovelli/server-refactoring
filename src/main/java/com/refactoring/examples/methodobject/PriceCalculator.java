package com.refactoring.examples.methodobject;

public class PriceCalculator {

    private final MethodObject methodObject;
    private double price;
    private int quantity;
    private int year;
    private double secondaryBase = 12.5;
    private double tertiaryBase = 1.2;
    private double discountPercentage = 0.1;

    public PriceCalculator(MethodObject methodObject,
                           double price,
                           int quantity,
                           int year) {
        this.methodObject = methodObject;
        this.price = price;
        this.quantity = quantity;
        this.year = year;

        setUpBasePrice();
    }

    public double compute() {
        return applyPrices();
    }

    private void setUpBasePrice() {
        int yearDiscount = year - ((int) methodObject.base);

        if (yearDiscount > 2000) {
            secondaryBase += 3;
            discountPercentage += 0.2;
        } else {
            tertiaryBase += 10;
            discountPercentage += 0.4;
        }
    }

    private double applyPrices() {
        double tempPrice = price + secondaryBase + tertiaryBase;
        double mediaPrice = tempPrice / 3;
        double finalPrice = quantity * mediaPrice;
        double priceDiscount = finalPrice - discountPercentage;

        return priceDiscount;
    }


}
