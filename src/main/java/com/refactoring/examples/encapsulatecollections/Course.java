package com.refactoring.examples.encapsulatecollections;

public class Course {
    private String name;
    private boolean isAdvanced;

    public Course(String name, boolean isAdvanced) {
        this.name = name;
        this.isAdvanced = isAdvanced;
    }

    public boolean isAdvanced() {
        return isAdvanced;
    }

    @Override
    public String toString() {
        return "Course{name=" + name + ", isAdvanced=" + isAdvanced + "}";
    }
}
