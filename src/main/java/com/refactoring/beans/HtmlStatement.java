package com.refactoring.beans;

public class HtmlStatement extends Statement {

    public String getFooter(Customer customer) {
        return "\n<b>Amount owed is: </b>" + String.valueOf(customer.getTotalCharge()) + "\n" +
                "<b>You earned: </b>" + String.valueOf(customer.getFrequentRenterPoints() + "</html>");
    }

    public String getMovieDetails(Rental rental) {
        return "<b>" + rental.getMovie().getTitle() + "</b>\tprice=" + String.valueOf(rental.getCharge()) + "\n";
    }

    public String getHeader(Customer customer) {
        return "<html><b>Rental Record for </b>" + customer.getName() + "\n";
    }
}
