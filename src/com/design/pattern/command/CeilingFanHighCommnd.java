package com.design.pattern.command;

/**
 * @author: wangzhenqing
 * @date: 2015-07-30 16:48:45
 * @description: 风扇高速
 */
public class CeilingFanHighCommnd implements Command{

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommnd(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH){
            ceilingFan.high();
        }else if (prevSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium();
        }else if (prevSpeed == CeilingFan.LOW){
            ceilingFan.low();
        }else if (prevSpeed == CeilingFan.OFF){
            ceilingFan.off();
        }

    }
}
