package com.singh.low.level.design;

import com.singh.low.level.design.enums.LLDName;

import java.util.Objects;

public class LLDFactory {
    private static volatile LLDFactory lldFactory;

    /**
     * Private Constructor so it can not be instantiated from outside.
     */
    private LLDFactory() {}

    /**
     * Get an instance of this class
     * creates a new instance if it doesn't exist else returns the existing instance
     * synchronized ensures thread safety - only 1 instance is created even if multiple threads calls this method at once
     *
     * @return Instance of LLDFactory
     */
    public static synchronized LLDFactory getInstance() {
        if (Objects.isNull(lldFactory)) {
            synchronized (LLDFactory.class) {
                if (Objects.isNull(lldFactory))
                    lldFactory = new LLDFactory();
            }
        }
        return lldFactory;
    }

    /**
     * Get an LLD based on input
     *
     * @param lldName Type of LLD to be returned
     * @return LLD of type lldName
     */
    public LLD getLLD(LLDName lldName) {
        switch (lldName) {
            case PARKING_LOT:
                return null;

            default:
                throw new IllegalArgumentException("No such LLD implemented!");
        }
    }
}
