package com.design.pattern.compound.observer;

/**
 * @author: wangzhenqing
 * @date: 2015-08-11 11:12:55
 * @description: 鸭子模拟器，统计叫声次数
 */
public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory factory = new CountingDuckFactory();
        duckSimulator.simulate(factory);
    }

    public void simulate(AbstractDuckFactory factory) {
//        Quackable mallardDuck = factory.createMallardDuck();
        Quackable redheadDuck = factory.createRedHeadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator: With Composite - Flocks");

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(goose);

        Flock flockOfMallards = new Flock();

        Quackable mallard1 = factory.createMallardDuck();
        Quackable mallard2 = factory.createMallardDuck();
        Quackable mallard3 = factory.createMallardDuck();
        Quackable mallard4 = factory.createMallardDuck();
        flockOfMallards.add(mallard1);
        flockOfMallards.add(mallard2);
        flockOfMallards.add(mallard3);
        flockOfMallards.add(mallard4);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: Whole Flock Simulation");

        simulate(flockOfDucks);

        System.out.println("\nDuck Simulator: Mallard Flock Simulation");

        simulate(flockOfMallards);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
