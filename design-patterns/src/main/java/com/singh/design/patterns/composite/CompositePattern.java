package com.singh.design.patterns.composite;

import com.singh.design.patterns.DesignPattern;
import com.singh.design.patterns.enums.DesignPatternName;

public class CompositePattern implements DesignPattern {
    @Override
    public DesignPatternName getName() {
        return DesignPatternName.COMPOSITE;
    }

    @Override
    public void run() {
        ArithmeticTerm constant3 = new ArithmeticOperand(3);
        ArithmeticTerm constant4 = new ArithmeticOperand(4);
        ArithmeticTerm constant2 = new ArithmeticOperand(2);
        ArithmeticTerm operatorMultiply = new ArithmeticOperator(Operator.MULTIPLY, constant3, constant2);
        ArithmeticTerm operatorAdd = new ArithmeticOperator(Operator.ADD, constant4, operatorMultiply);

        System.out.println("Result of arithmetic expression [4 + (3 * 2)] : " + operatorAdd.evaluate());
    }
}
