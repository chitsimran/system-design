package com.singh.design.patterns.adapter;

public class StudentAdapter {
    public static CollegeStudent asCollegeStudent(SchoolStudent schoolStudent) {
        return new CollegeStudent(schoolStudent.getFirstName() + " " + schoolStudent.getLastName());
    }
}
