package com.refactoring.beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Assert;

@RunWith(SpringRunner.class)
public class CustomerTests {

    private String statement = "Rental Record for Jordí Llimarez\nShinning\tprice=6.0\nShrek movie\tprice=5.0\n" +
            "Exorcist\tprice=3.0\nBlade Runner\tprice=18.0\nAnnie Hall\tprice=2.0\n\nAmount owed is 34.0\nYou earned: 7";

    @Test
    public void statement() {
        Customer customer = new Customer("Jordí Llimarez");
        Movie movie1 = new Movie("Shinning", 1);
        Movie movie2 = new Movie("Shrek movie", 0);
        Movie movie3 = new Movie("Exorcist", 1);
        Movie movie4 = new Movie("Blade Runner", 1);
        Movie movie5 = new Movie("Annie Hall", 0);

        Rental rental1 = new Rental(movie1, 2);
        Rental rental2 = new Rental(movie2, 4);
        Rental rental3 = new Rental(movie3, 1);
        Rental rental4 = new Rental(movie4, 6);
        Rental rental5 = new Rental(movie5, 1);

        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);
        customer.addRental(rental4);
        customer.addRental(rental5);

        Assert.assertEquals(statement, customer.statement());
    }

}
