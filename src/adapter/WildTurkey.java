package adapter;

/**
 * @author: wangzhenqing
 * @date: 2015-07-31 16:00:10
 * @description: 火鸡的一种
 */
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
