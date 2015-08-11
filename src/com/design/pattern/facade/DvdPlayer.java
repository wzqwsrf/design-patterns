package com.design.pattern.facade;

/**
 * @author: wangzhenqing
 * @date: 2015-08-03 15:48:19
 * @description: DVD播放器
 */
public class DvdPlayer {
    public void on() {
        System.out.println("Top-O-Line DVD Player on");
    }

    public void play(String movie) {
        System.out.println("Top-O-Line DVD Player playing \""+movie+"\"");
    }

    public void stop(String movie) {
        System.out.println("Top-O-Line DVD Player stopped \""+movie+"\"");
    }

    public void eject() {
        System.out.println("Top-O-Line DVD Player eject");
    }

    public void off() {
        System.out.println("Top-O-Line DVD Player off");
    }
}
