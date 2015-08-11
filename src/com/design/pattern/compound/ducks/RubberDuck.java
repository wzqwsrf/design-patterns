package com.design.pattern.compound.ducks;

import com.design.pattern.compound.ducks.Quackable;

/**
 * @author: wangzhenqing
 * @date: 2015-08-11 09:59:39
 * @description: 橡皮鸭
 */
public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
