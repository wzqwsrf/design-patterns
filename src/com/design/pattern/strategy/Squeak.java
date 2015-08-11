package com.design.pattern.strategy;

/**
 * @author: wangzhenqing
 * @date: 2015-07-22 11:00:51
 * @description: 吱吱叫
 */
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
