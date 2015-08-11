package com.design.pattern.facade;

/**
 * @author: wangzhenqing
 * @date: 2015-08-03 15:53:16
 * @description: 爆米花机
 */
public class PopcornPopper {
    public void on() {
        System.out.println("Popcorn Popper on");
    }

    public void pop() {
        System.out.println("Popcorn Popper popping popcorn!");
    }

    public void off() {
        System.out.println("Popcorn Popper off");
    }
}
