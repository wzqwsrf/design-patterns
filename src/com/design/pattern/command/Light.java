package com.design.pattern.command;

/**
 * @author: wangzhenqing
 * @date: 2015-07-30 15:10:07
 * @description: 灯
 */
public class Light {
    String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " Light is on!");
    }

    public void off() {
        System.out.println(name + " Light is off!");
    }
}
