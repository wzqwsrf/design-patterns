package strategy;

/**
 * @author: wangzhenqing
 * @date: 2015-07-22 10:57:53
 * @description: 会飞的鸭子
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
