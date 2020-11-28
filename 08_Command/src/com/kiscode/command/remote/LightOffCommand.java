package com.kiscode.command.remote;

/****
 * Description: 开灯命令
 * Author:  keno
 * CreateDate: 2020/11/28 11:39
 */
class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        //执行相反操作
        light.turnOn();
    }
}
