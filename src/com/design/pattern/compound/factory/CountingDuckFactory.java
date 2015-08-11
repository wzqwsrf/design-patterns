package com.design.pattern.compound.factory;

import com.design.pattern.compound.decorator.QuackCounter;
import com.design.pattern.compound.ducks.*;

/**
 * @author: wangzhenqing
 * @date: 2015-08-11 15:30:19
 * @description: 统计叫声次数
 */
public class CountingDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackCounter(new RedHeadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
