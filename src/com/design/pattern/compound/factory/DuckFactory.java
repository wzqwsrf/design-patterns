package com.design.pattern.compound.factory;

import com.design.pattern.compound.ducks.*;

/**
 * @author: wangzhenqing
 * @date: 2015-08-11 15:28:48
 * @description: 没有装饰者的鸭子
 */
public class DuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new RedHeadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
