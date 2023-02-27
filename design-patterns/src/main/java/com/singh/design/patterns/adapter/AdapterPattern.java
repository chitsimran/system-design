package com.singh.design.patterns.adapter;

import com.singh.design.patterns.DesignPattern;
import com.singh.design.patterns.enums.DesignPatternName;

public class AdapterPattern implements DesignPattern {
    @Override
    public DesignPatternName getName() {
        return DesignPatternName.ADAPTER;
    }

    @Override
    public void run() {
        SchoolStudent schoolStudent = new SchoolStudent("John", "Banks");
        CollegeStudent collegeStudent = StudentAdapter.asCollegeStudent(schoolStudent);
        System.out.println(collegeStudent);
    }
}
