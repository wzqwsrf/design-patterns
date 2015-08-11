package com.design.pattern.strategy;

/**
 * @author: wangzhenqing
 * @date: 2015-07-22 11:14:38
 * @description: 搭乘火箭飞翔
 */
public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
