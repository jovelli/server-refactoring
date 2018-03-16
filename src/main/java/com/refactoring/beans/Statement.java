package com.refactoring.beans;

public abstract class Statement {

    public String value(Customer customer) {
        String result = getHeader(customer);

        for (Rental rental: customer.getRentals()) {
            result += getMovieDetails(rental);
        }

        result += getFooter(customer);
        return result;
    }

    public abstract String getHeader(Customer customer);
    public abstract String getMovieDetails(Rental rental);
    public abstract String getFooter(Customer customer);
}
