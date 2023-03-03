package com.singh.design.patterns.decorator;

import com.singh.design.patterns.DesignPattern;
import com.singh.design.patterns.decorator.pizza.MargheritaPizza;
import com.singh.design.patterns.decorator.pizza.PepperoniPizza;
import com.singh.design.patterns.decorator.pizza.Pizza;
import com.singh.design.patterns.decorator.toppings.CheeseTopping;
import com.singh.design.patterns.decorator.toppings.OnionTopping;
import com.singh.design.patterns.enums.DesignPatternName;

public class DecoratorPattern implements DesignPattern {
    @Override
    public DesignPatternName getName() {
        return DesignPatternName.DECORATOR;
    }

    @Override
    public void run() {
        Pizza pizza = new CheeseTopping(new MargheritaPizza());
        Pizza pizza1 = new CheeseTopping(new OnionTopping(new PepperoniPizza()));

        System.out.println("Cost for MargheritaPizza + CheeseTopping: " + pizza.cost());
        System.out.println("Cost for PepperoniPizza + OnionTopping + CheeseTopping: " + pizza1.cost());
    }
}
