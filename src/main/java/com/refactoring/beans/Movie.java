package com.refactoring.beans;

public class Movie {
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;

    private String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }

    public void setPriceCode(int code) {

        switch (code) {
            case REGULAR: this.price = new RegularPrice(); break;
            case NEW_RELEASE: this.price = new NewReleasePrice(); break;
            case CHILDRENS: this.price = new ChildrensPrice(); break;
            default:
                throw new IllegalArgumentException("PriceCode doesn't exist");
        }
    }

    public String getTitle() {
        return this.title;
    }

}
