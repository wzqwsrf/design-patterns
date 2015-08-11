package com.design.pattern.command;

/**
 * @author: wangzhenqing
 * @date: 2015-07-31 10:38:17
 * @description: 打开风扇
 */
public class CeilingFanOnCommnd implements Command{

    CeilingFan ceilingFan;

    public CeilingFanOnCommnd(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
