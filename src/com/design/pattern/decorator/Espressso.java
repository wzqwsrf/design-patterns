package com.design.pattern.decorator;

/**
 * @author: wangzhenqing
 * @date: 2015-07-24 15:25:30
 * @description: 浓缩咖啡
 */
public class Espressso extends Beverage{

    public Espressso() {
        description = "Espressso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
