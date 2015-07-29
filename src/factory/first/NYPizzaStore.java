package factory.first;

/**
 * @author: wangzhenqing
 * @date: 2015-07-28 17:28:44
 * @description: 纽约pizza
 */
public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new NYStyleCheesePizza();
        }
        if (type.equals("veggie")){
            return new NYStyleVeggiePizza();
        }
        if (type.equals("clam")){
            return new NYStyleClamPizza();
        }
        if (type.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        }
        return null;
    }
}
