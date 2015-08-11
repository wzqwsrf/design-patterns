package com.design.pattern.strategy;

/**
 * @author: wangzhenqing
 * @date: 2015-07-22 10:58:04
 * @description: 不会飞的鸭子
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
