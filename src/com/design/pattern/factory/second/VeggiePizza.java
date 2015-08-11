package com.design.pattern.factory.second;

/**
 * @author: wangzhenqing
 * @date: 2015-07-29 11:25:29
 * @description: 蔬菜披萨
 */
public class VeggiePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {

    }
}
