package com.design.pattern.decorator;

/**
 * @author: wangzhenqing
 * @date: 2015-07-24 15:36:55
 * @description: 具体装饰者
 */
public class Soy extends CondimentDecorator{

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
