package com.design.pattern.factory.second;

/**
 * @author: wangzhenqing
 * @date: 2015-07-29 10:35:35
 * @description: 披萨原料接口
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
