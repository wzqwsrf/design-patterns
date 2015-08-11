package com.design.pattern.command;

/**
 * @author: wangzhenqing
 * @date: 2015-07-30 15:10:16
 * @description: 关灯具体动作
 */
public class LightOffCommand implements Command{

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
