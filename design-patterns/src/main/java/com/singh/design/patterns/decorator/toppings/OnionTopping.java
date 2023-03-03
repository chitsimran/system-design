package com.singh.design.patterns.decorator.toppings;

import com.singh.design.patterns.decorator.pizza.Pizza;

public class OnionTopping extends Topping {
    private final Pizza pizza;

    public OnionTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public Integer cost() {
        return pizza.cost() + 20;
    }
}
