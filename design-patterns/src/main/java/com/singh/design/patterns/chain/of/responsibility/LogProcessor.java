package com.singh.design.patterns.chain.of.responsibility;

public abstract class LogProcessor {
    public LogProcessor nextProcessor;

    public LogProcessor(LogProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public abstract void log(LogLevel logLevel, String message);
}
