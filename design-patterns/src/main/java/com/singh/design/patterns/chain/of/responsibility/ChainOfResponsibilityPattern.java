package com.singh.design.patterns.chain.of.responsibility;

import com.singh.design.patterns.DesignPattern;
import com.singh.design.patterns.enums.DesignPatternName;

public class ChainOfResponsibilityPattern implements DesignPattern {
    @Override
    public DesignPatternName getName() {
        return DesignPatternName.CHAIN_OF_RESPONSIBILITY;
    }

    @Override
    public void run() {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        System.out.println("Testing logging at different levels");

        logProcessor.log(LogLevel.INFO, "Test message for info");
        logProcessor.log(LogLevel.DEBUG, "Test message for debug");
        logProcessor.log(LogLevel.ERROR, "Test message for error");
    }
}
