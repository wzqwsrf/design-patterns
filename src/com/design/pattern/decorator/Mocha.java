package com.design.pattern.decorator;

/**
 * @author: wangzhenqing
 * @date: 2015-07-24 15:29:18
 * @description: 具体装饰者
 */
public class Mocha extends CondimentDecorator{

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
