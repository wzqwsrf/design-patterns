package com.design.pattern.compound.factory;

import com.design.pattern.compound.adapter.Goose;
import com.design.pattern.compound.adapter.GooseAdapter;
import com.design.pattern.compound.decorator.QuackCounter;
import com.design.pattern.compound.ducks.*;

/**
 * @author: wangzhenqing
 * @date: 2015-08-11 15:31:46
 * @description: 鸭子模拟器，统计叫声次数
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory factory = new CountingDuckFactory();
        duckSimulator.simulate(factory);
    }

    public void simulate(AbstractDuckFactory factory) {
        Quackable mallardDuck = factory.createMallardDuck();
        Quackable redheadDuck = factory.createRedHeadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator: With Abstract Factory");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
