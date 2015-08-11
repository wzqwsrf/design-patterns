package com.design.pattern.command;

/**
 * @author: wangzhenqing
 * @date: 2015-07-30 16:48:54
 * @description: 风扇中速
 */
public class CeilingFanMediumCommnd implements Command{

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanMediumCommnd(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
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
