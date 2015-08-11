package compound;

/**
 * @author: wangzhenqing
 * @date: 2015-08-11 09:56:07
 * @description: 鸭鸣器
 */
public class DuckCall implements Quackable{
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
