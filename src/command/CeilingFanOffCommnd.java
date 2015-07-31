package command;

/**
 * @author: wangzhenqing
 * @date: 2015-07-31 10:38:06
 * @description: 关闭风扇
 */
public class CeilingFanOffCommnd implements Command{

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOffCommnd(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
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
