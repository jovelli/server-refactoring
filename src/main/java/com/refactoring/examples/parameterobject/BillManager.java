package com.refactoring.examples.parameterobject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BillManager {
    private final List<Bill> bills = new ArrayList<>();

    public BillManager() {
        this.bills.add(new Bill(12.0, LocalDate.of(2011, 02, 01)));
        this.bills.add(new Bill(11.0, LocalDate.of(2009, 02, 01)));
        this.bills.add(new Bill(10.0, LocalDate.of(2010, 02, 01)));
        this.bills.add(new Bill(31.0, LocalDate.of(2010, 04, 01)));
        this.bills.add(new Bill(30.0, LocalDate.of(2010, 01, 01)));
    }

    public double getEntriesBetween(DateRange dateRange) {
        return bills.stream().filter(bill -> dateRange.isIncluded(bill.getDate()))
                .mapToDouble(bill -> bill.getValue())
                .sum();
    }

}
