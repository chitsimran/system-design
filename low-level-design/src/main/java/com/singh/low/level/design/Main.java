package com.singh.low.level.design;

import com.singh.low.level.design.enums.LLDName;

public class Main {
    public static void main(String[] args) {
        System.out.println("Application running!");

        LLDFactory designPatternFactory = LLDFactory.getInstance();

        LLD lld = designPatternFactory.getLLD(LLDName.PARKING_LOT);
        System.out.println("Running code for: " + lld.getName());
        lld.run();
    }
}
