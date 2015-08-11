package com.design.pattern.compound.decorator;

import com.design.pattern.compound.adapter.Goose;
import com.design.pattern.compound.adapter.GooseAdapter;
import com.design.pattern.compound.ducks.*;

/**
 * @author: wangzhenqing
 * @date: 2015-08-11 11:12:55
 * @description: 鸭子模拟器，统计叫声次数
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
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
