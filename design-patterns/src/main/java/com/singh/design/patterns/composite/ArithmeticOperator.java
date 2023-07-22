package com.singh.design.patterns.composite;

/**
 * Arithmetic Operator is the operator which operates on constants
 * It can be + - * / [Supported here]
 */
public class ArithmeticOperator implements ArithmeticTerm {
    private Operator operator;
    private ArithmeticTerm leftExpression;
    private ArithmeticTerm rightExpression;

    public ArithmeticOperator(Operator operator, ArithmeticTerm leftExpression, ArithmeticTerm rightExpression) {
        this.operator = operator;
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public double evaluate() {
        switch (operator) {
            case ADD:
                return leftExpression.evaluate() + rightExpression.evaluate();

            case SUBTRACT:
                return leftExpression.evaluate() - rightExpression.evaluate();

            case MULTIPLY:
                return leftExpression.evaluate() * rightExpression.evaluate();

            case DIVIDE:
                return leftExpression.evaluate() / rightExpression.evaluate();

            default:
                throw new IllegalStateException("Operator not supported: " + operator);
        }
    }
}
