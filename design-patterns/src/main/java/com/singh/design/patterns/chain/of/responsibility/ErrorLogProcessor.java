package com.singh.design.patterns.chain.of.responsibility;

public class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void log(LogLevel logLevel, String message) {
        if (logLevel.equals(LogLevel.ERROR)) {
            System.out.println("ERROR: " + message);
        } else {
            throw new IllegalArgumentException("Log level doesn't exist");
        }
    }
}
