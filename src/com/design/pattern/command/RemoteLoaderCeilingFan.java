package com.design.pattern.command;

/**
 * @author: wangzhenqing
 * @date: 2015-07-30 16:47:43
 * @description: 风扇测试类
 */
public class RemoteLoaderCeilingFan {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanMediumCommnd ceilingFanMediumCommnd = new CeilingFanMediumCommnd(ceilingFan);
        CeilingFanHighCommnd ceilingFanHighCommnd = new CeilingFanHighCommnd(ceilingFan);
        CeilingFanOffCommnd ceilingFanOffCommnd = new CeilingFanOffCommnd(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMediumCommnd, ceilingFanOffCommnd);
        remoteControl.setCommand(1, ceilingFanHighCommnd, ceilingFanOffCommnd);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();

        remoteControl.onButtonWasPressed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();
    }
}
