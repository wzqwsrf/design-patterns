package com.design.pattern.compound.adapter;

import com.design.pattern.compound.ducks.Quackable;

/**
 * @author: wangzhenqing
 * @date: 2015-08-11 11:02:50
 * @description: 鹅适配器
 */
public class GooseAdapter implements Quackable {
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
