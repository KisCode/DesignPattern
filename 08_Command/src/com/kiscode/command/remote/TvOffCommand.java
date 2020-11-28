package com.kiscode.command.remote;

/****
 * Description: 开灯命令
 * Author:  keno
 * CreateDate: 2020/11/28 11:39
 */
class TvOffCommand implements Command {
    private Tv tv;

    public TvOffCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }

    @Override
    public void undo() {
        tv.turnOn();
    }
}
