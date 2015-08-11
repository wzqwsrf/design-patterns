package com.design.pattern.command;

/**
 * @author: wangzhenqing
 * @date: 2015-07-30 15:09:49
 * @description: 开门指令，调用具体开门动作
 */
public class GarageDoorOpenCommand implements Command{

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }

}
