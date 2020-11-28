package com.kiscode.command.remote;

/****
 * Description: 开灯命令
 * Author:  keno
 * CreateDate: 2020/11/28 11:39
 */
class TvOnCommand implements Command {
    private Tv tv;

    public TvOnCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }

    @Override
    public void undo() {
        tv.turnOff();
    }
}
