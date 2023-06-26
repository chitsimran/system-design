package com.singh.design.patterns.chain.of.responsibility;

public class DebugLogProcessor extends LogProcessor {
    public DebugLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void log(LogLevel logLevel, String message) {
        if (logLevel.equals(LogLevel.DEBUG)) {
            System.out.println("DEBUG: " + message);
        } else {
            nextProcessor.log(logLevel, message);
        }
    }
}
