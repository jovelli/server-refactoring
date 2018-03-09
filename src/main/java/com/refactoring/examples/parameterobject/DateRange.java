package com.refactoring.examples.parameterobject;

import java.time.LocalDate;

public final class DateRange {
    private final LocalDate start;
    private final LocalDate end;

    public DateRange(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public LocalDate getStart() {
        return this.start;
    }

    public LocalDate getEnd() {
        return this.end;
    }

    public boolean isIncluded(LocalDate date) {
        return (date.equals(start) || date.equals(end) ||
                (date.isAfter(start) && date.isBefore(end)));
    }
}
