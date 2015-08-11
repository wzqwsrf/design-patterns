package com.design.pattern.compound.ducks;

import com.design.pattern.compound.ducks.Quackable;

/**
 * @author: wangzhenqing
 * @date: 2015-08-10 15:34:28
 * @description: 红头鸭
 */
public class RedHeadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
