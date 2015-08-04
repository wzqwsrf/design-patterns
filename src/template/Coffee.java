package template;

/**
 * @author: wangzhenqing
 * @date: 2015-08-04 11:26:56
 * @description: 咖啡
 */
public class Coffee extends CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
