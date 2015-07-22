package factory;

/**
 * @author: wangzhenqing
 * @date: 2015-07-22 11:09:21
 * @description: 测试类
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallarDuck();
        duck.performFly();
        duck.performQuack();
        duck.display();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.display();
    }
}
