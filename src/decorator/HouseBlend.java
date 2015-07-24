package decorator;

/**
 * @author: wangzhenqing
 * @date: 2015-07-24 15:27:03
 * @description: 混合咖啡
 */
public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
