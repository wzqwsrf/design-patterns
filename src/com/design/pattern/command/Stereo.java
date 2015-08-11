package com.design.pattern.command;

/**
 * @author: wangzhenqing
 * @date:
 * @description:
 */
public class Stereo {

    String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " Stereo is On!");
    }

    public void setCD() {
        System.out.println(name + " Stereo set CD!");
    }

    public void setVolume(int volume) {
        System.out.println(name + " Stereo set Volume " + volume);
    }

    public void off() {
        System.out.println(name + " Stereo is Off!");
    }
}
