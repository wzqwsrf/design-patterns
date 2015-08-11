package com.design.pattern.facade;

/**
 * @author: wangzhenqing
 * @date: 2015-08-03 15:51:09
 * @description: 剧场灯光
 */
public class TheaterLights {
    public void dim(int height) {
        System.out.println("Theater Ceiling Lights dimming to " + height + "%");
    }

    public void on() {
        System.out.println("Theater Ceiling Lights on");
    }
}
