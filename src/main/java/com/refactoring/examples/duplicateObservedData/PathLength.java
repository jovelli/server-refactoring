package com.refactoring.examples.duplicateObservedData;

import java.util.Observable;

public class PathLength extends Observable {

    private Double start = 0.0;
    private Double end = 0.0;
    private Double length = 0.0;

    public void recalculateLength() {
        setLength(end - start);
    }

    public void recalculateEnd() {
        setEnd(start + length);
    }

    public Double getStart() {
        return this.start;
    }

    public void setStart(Double start) {
        this.start = start;
        setChanged();
        notifyObservers();
    }

    public Double getEnd() {
        return this.end;
    }

    public void setEnd(Double end) {
        this.end = end;
        setChanged();
        notifyObservers();
    }

    public Double getLength() {
        return this.length;
    }

    public void setLength(Double length) {
        this.length = length;
        setChanged();
        notifyObservers();
    }
}
