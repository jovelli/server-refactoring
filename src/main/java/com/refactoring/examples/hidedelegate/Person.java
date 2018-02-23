package com.refactoring.examples.hidedelegate;

public class Person {

    Department department = new Department();

    public String getManager() {
        return department.getManager();
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
