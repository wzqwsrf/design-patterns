package command;

/**
 * @author: wangzhenqing
 * @date:
 * @description:
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
