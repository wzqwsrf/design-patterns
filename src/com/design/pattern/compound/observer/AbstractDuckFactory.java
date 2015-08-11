package com.design.pattern.compound.observer;

/**
 * @author: wangzhenqing
 * @date: 2015-08-11 15:26:23
 * @description: 抽象鸭子工厂
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedHeadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
