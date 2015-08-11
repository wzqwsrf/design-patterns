package compound;

/**
 * @author: wangzhenqing
 * @date: 2015-08-11 11:09:59
 * @description: 装饰器，功能是统计鸭子叫次数
 */
public class QuackCounter implements Quackable{

    static int numberOfQuacks;

    Quackable quackable;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
        numberOfQuacks = 0;
    }

    @Override
    public void quack() {
        quackable.quack();
        numberOfQuacks++;
    }

    public static int getQuacks(){
        return numberOfQuacks;
    }
}
