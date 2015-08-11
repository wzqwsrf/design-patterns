package com.design.pattern.compound.observer;

/**
 * @author: wangzhenqing
 * @date: 2015-08-10 15:26:48
 * @description: 鸭子叫接口
 */
public interface Quackable extends QuackObservable{
    void quack();
}
