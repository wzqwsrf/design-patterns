package com.design.pattern.compound.ducks;

import com.design.pattern.compound.adapter.Goose;
import com.design.pattern.compound.adapter.GooseAdapter;

/**
 * @author: wangzhenqing
 * @date: 2015-08-11 10:42:48
 * @description: 鸭子模拟器
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate();
    }

    public void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedHeadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
