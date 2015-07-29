package factory.first;

/**
 * @author: wangzhenqing
 * @date: 2015-07-28 17:53:32
 * @description: 纽约披萨
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
