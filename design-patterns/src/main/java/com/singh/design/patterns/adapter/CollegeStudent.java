package com.singh.design.patterns.adapter;

public class CollegeStudent {
    private String name;

    public CollegeStudent(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "[" + this.name + "]";
    }
}
