package com.design.pattern.factory.first;

/**
 * @author: wangzhenqing
 * @date: 2015-07-28 17:58:21
 * @description: 芝加哥披萨store
 */
public class ChicagoStylePizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }
        if (type.equals("veggie")){
            return new ChicagoStyleVeggiePizza();
        }
        if (type.equals("clam")){
            return new ChicagoStyleClamPizza();
        }
        if (type.equals("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        }
        return null;
    }
}
