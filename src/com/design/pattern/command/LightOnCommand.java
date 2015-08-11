package com.design.pattern.command;

/**
 * @author: wangzhenqing
 * @date: 2015-07-30 15:10:16
 * @description: 开灯具体动作
 */
public class LightOnCommand implements Command{

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
