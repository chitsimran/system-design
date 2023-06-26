package com.singh.design.patterns.chain.of.responsibility;

public class InfoLogProcessor extends LogProcessor {
    public InfoLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void log(LogLevel logLevel, String message) {
        if (logLevel.equals(LogLevel.INFO)) {
            System.out.println("INFO: " + message);
        } else {
            nextProcessor.log(logLevel, message);
        }
    }
}
