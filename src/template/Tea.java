package template;

/**
 * @author: wangzhenqing
 * @date: 2015-08-04 11:25:59
 * @description: 茶
 */
public class Tea extends CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
