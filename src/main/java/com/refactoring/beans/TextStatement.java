package com.refactoring.beans;

public class TextStatement extends Statement {

    public String getFooter(Customer customer) {
        return "\nAmount owed is: " + String.valueOf(customer.getTotalCharge()) + "\n" +
                "You earned: " + String.valueOf(customer.getFrequentRenterPoints());
    }

    public String getMovieDetails(Rental rental) {
        return rental.getMovie().getTitle() + "\tprice=" + String.valueOf(rental.getCharge()) + "\n";
    }

    public String getHeader(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }
}
