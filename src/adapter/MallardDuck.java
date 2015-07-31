package adapter;

/**
 * @author: wangzhenqing
 * @date: 2015-07-31 15:58:10
 * @description: 绿头鸭
 */
public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
