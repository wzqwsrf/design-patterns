package com.design.pattern.command;

/**
 * @author: wangzhenqing
 * @date: 2015-07-30 15:09:38
 * @description: 开门动作
 */
public class GarageDoor {
    String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println(name + " Garage Door is Open!");
    }

    public void down() {
        System.out.println(name + " Garage Door is Close!");
    }
}
