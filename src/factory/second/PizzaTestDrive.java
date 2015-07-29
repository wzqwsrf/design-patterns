package factory.second;

/**
 * @author: wangzhenqing
 * @date: 2015-07-29 11:12:32
 * @description: 测试类
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
//        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

//        pizza = chicagoStore.orderPizza("cheese");
//        System.out.println("Joel ordered a " + pizza.getName() + "\n");

    }


}
