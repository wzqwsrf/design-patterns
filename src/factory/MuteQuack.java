package factory;

/**
 * @author: wangzhenqing
 * @date: 2015-07-22 10:59:29
 * @description: 不会叫
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Silence!");
    }
}
