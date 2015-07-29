package factory.first;

/**
 * @author: wangzhenqing
 * @date: 2015-07-28 17:12:17
 * @description: 披萨工厂
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
