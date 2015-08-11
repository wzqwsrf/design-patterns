package com.design.pattern.compound.ducks;

/**
 * @author: wangzhenqing
 * @date: 2015-08-10 15:29:46
 * @description: 绿头鸭
 */
public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
