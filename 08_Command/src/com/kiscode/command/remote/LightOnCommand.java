package com.kiscode.command.remote;

/****
 * Description: 开灯命令
 * Author:  keno
 * CreateDate: 2020/11/28 11:39
 */
class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
