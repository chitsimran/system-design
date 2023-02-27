package com.singh.design.patterns.builder;

import com.singh.design.patterns.DesignPattern;
import com.singh.design.patterns.enums.DesignPatternName;

public class BuilderPattern implements DesignPattern {
    @Override
    public DesignPatternName getName() {
        return DesignPatternName.BUILDER;
    }

    @Override
    public void run() {
        System.out.println("Creating a Player with Builder pattern.");
        Player player1 = new Player.PlayerBuilder()
                .name("Singh")
                .country("India")
                .debutYear(2023)
                .matchesPlayed(8)
                .build();

        System.out.println(player1.toString());
    }
}
