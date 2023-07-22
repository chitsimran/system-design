package com.singh.design.patterns.composite;

/**
 * ArithmeticTerm is the smallest unit of an Arithmetic expression
 * It can be a constant, operator etc.
 */
public interface ArithmeticTerm {
    double evaluate();
}
