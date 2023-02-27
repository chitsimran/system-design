package com.singh.design.patterns;

import com.singh.design.patterns.adapter.AdapterPattern;
import com.singh.design.patterns.builder.BuilderPattern;
import com.singh.design.patterns.enums.DesignPatternName;
import com.singh.design.patterns.strategy.StrategyPattern;

import java.util.Objects;

public class DesignPatternFactory {

    private static volatile DesignPatternFactory designPatternFactory;

    /**
     * Private Constructor so it can not be instantiated from outside.
     */
    private DesignPatternFactory() {}

    /**
     * Get an instance of this class
     * creates a new instance if it doesn't exist else returns the existing instance
     * synchronized ensures thread safety - only 1 instance is created even if multiple threads calls this method at once
     *
     * @return Instance of DesignPatternFactory
     */
    public static synchronized DesignPatternFactory getInstance() {
        if (Objects.isNull(designPatternFactory)) {
            synchronized (DesignPatternFactory.class) {
                if (Objects.isNull(designPatternFactory))
                    designPatternFactory = new DesignPatternFactory();
            }
        }
        return designPatternFactory;
    }

    /**
     * Get a DesignPattern based on input
     *
     * @param designPatternName Type of Design pattern to be returned
     * @return DesignPattern of type pattern
     */
    public DesignPattern getDesignPattern(DesignPatternName designPatternName) {
        switch (designPatternName) {
            case BUILDER:
                return new BuilderPattern();

            case ADAPTER:
                return new AdapterPattern();

            case STRATEGY:
                return new StrategyPattern();

            default:
                throw new IllegalArgumentException("No such pattern implemented!");
        }
    }
}
