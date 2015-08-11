package com.design.pattern.factory.second;

/**
 * @author: wangzhenqing
 * @date: 2015-07-29 11:21:46
 * @description: 意大利辣味香肠比萨
 */
public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {

    }
}
