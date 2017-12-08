package com.refactoring.beans;

public abstract class Price {
    abstract double getCharge(int daysRented);
    int getFrequentRenterPoints(int daysRented) { return 1; }
}

class RegularPrice extends Price {

    @Override
    double getCharge(int daysRented) {
        double amount = 2;

        if (daysRented > 2) {
            amount += (daysRented - 2) * 1.5;
        }
        return amount;
    }
}

class ChildrensPrice extends Price {

    @Override
    double getCharge(int daysRented) {
        double amount = 1.5;

        if (daysRented > 3) {
            amount += (daysRented - 3) * 1.5;
        }
        return amount;
    }
}

class NewReleasePrice extends Price {

    @Override
    double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}


