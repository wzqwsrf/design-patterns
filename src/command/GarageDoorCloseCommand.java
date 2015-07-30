package command;

/**
 * @author: wangzhenqing
 * @date: 2015-07-30 15:09:49
 * @description: 关门指令，调用具体关门动作
 */
public class GarageDoorCloseCommand implements Command{

    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }

}
