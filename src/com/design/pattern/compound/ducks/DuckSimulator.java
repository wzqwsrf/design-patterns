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
        duckSimulator.simulator();
    }

    public void simulator() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedHeadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();

        System.out.println("\nDuck Simulator");

        simulator(mallardDuck);
        simulator(redheadDuck);
        simulator(duckCall);
        simulator(rubberDuck);
    }

    private void simulator(Quackable duck) {
        duck.quack();
    }
}
