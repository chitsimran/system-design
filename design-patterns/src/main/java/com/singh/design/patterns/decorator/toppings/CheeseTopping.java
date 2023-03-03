package com.singh.design.patterns.decorator.toppings;

import com.singh.design.patterns.decorator.pizza.Pizza;

public class CheeseTopping extends Topping {
    private final Pizza pizza;

    public CheeseTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public Integer cost() {
        return pizza.cost() + 50;
    }
}
