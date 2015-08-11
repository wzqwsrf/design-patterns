package com.design.pattern.strategy;

/**
 * @author: wangzhenqing
 * @date: 2015-07-22 11:07:20
 * @description: 绿头鸭
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck!");
    }
}
