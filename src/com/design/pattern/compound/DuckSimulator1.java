package com.design.pattern.compound;

/**
 * @author: wangzhenqing
 * @date: 2015-08-11 11:12:55
 * @description: 鸭子模拟器，统计叫声次数
 */
public class DuckSimulator1 {

    public static void main(String[] args) {
        DuckSimulator1 duckSimulator = new DuckSimulator1();
        duckSimulator.simulator();
    }

    public void simulator() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedHeadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable goose = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator: With Decorator");

        simulator(mallardDuck);
        simulator(redheadDuck);
        simulator(duckCall);
        simulator(rubberDuck);
        simulator(goose);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    private void simulator(Quackable duck) {
        duck.quack();
    }
}
