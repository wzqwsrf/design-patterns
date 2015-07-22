package factory;

/**
 * @author: wangzhenqing
 * @date: 2015-07-22 10:58:51
 * @description: 呱呱叫
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
