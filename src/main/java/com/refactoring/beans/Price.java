package com.refactoring.beans;

public abstract class Price {
    public abstract double getCharge(int daysRented);
    public int getFrequentRenterPoints(int daysRented) { return 1; }
    public static RegularPrice createRegular() { return new RegularPrice(); }
    public static ChildrensPrice createChildren() { return new ChildrensPrice(); }
    public static NewReleasePrice createNewRelease() { return new NewReleasePrice(); }
}



