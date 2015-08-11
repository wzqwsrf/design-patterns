package com.design.pattern.adapter;

import java.util.Random;

/**
 * @author: wangzhenqing
 * @date: 2015-07-31 16:06:57
 * @description: 鸭子适配器
 */
public class DuckAdapter implements Turkey {
    Duck duck;
    Random random;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        random = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if (random.nextInt(5) == 0) {
            duck.fly();
        }
    }
}
