package com.design.pattern.decorator;

/**
 * @author: wangzhenqing
 * @date: 2015-07-24 15:37:01
 * @description: 具体装饰者
 */
public class Whip extends CondimentDecorator{

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.23 + beverage.cost();
    }
}
