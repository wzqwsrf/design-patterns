package com.design.pattern.facade;

/**
 * @author: wangzhenqing
 * @date: 2015-08-03 15:50:11
 * @description: 投影仪; 放映机，幻灯机; 设计者; 放映技师;
 */
public class Projector {
    public void on() {
        System.out.println("Top-O-Line Projector on");
    }

    public void wideScreenMode() {
        System.out.println("Top-O-Line Projector in widescreen mode (16*9 aspect ratio)");
    }

    public void off() {
        System.out.println("Top-O-Line Projector off");
    }
}
