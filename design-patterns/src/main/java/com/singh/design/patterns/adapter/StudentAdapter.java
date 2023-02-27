package com.singh.design.patterns.adapter;

public class StudentAdapter {
    /**
     * Converts a SchoolStudent to a CollegeStudent
     *
     * @param schoolStudent Object of SchoolStudent
     * @return CollegeStudent with details of passed SchoolStudent
     */
    public static CollegeStudent asCollegeStudent(SchoolStudent schoolStudent) {
        return new CollegeStudent(schoolStudent.getFirstName() + " " + schoolStudent.getLastName());
    }
}
