package com.singh.design.patterns;

import com.singh.design.patterns.enums.DesignPatternName;

public class Main {
    public static void main(String[] args) {
        System.out.println("Application running!");

        DesignPatternFactory designPatternFactory = DesignPatternFactory.getInstance();

        DesignPattern designPattern = designPatternFactory.getDesignPattern(DesignPatternName.COMPOSITE);
        System.out.println("Running code for: " + designPattern.getName());
        designPattern.run();
    }
}
