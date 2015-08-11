package com.design.pattern.command;

/**
 * @author: wangzhenqing
 * @date: 2015-07-30 15:10:26
 * @description: 发出指令
 */
public class SimpleRemoteControl {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed(){
        command.execute();
    }
}
