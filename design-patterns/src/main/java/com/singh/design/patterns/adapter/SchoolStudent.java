package com.singh.design.patterns.adapter;

public class SchoolStudent {
    private String firstName;
    private String lastName;

    public SchoolStudent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
