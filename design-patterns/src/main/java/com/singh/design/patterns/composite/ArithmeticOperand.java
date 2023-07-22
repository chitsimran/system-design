package com.singh.design.patterns.composite;

/**
 * Arithmetic Operand is a constant on which an operation is performed
 */
public class ArithmeticOperand implements ArithmeticTerm {
    private double value;

    public ArithmeticOperand(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }
}
