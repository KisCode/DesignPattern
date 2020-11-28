package com.kiscode.command.remote;

/****
 * Description: Invoker角色： 遥控器
 * Author:  keno
 * CreateDate: 2020/11/28 11:41
 */
class RemoteControl {
    private Command[] commands;
    private Command unDoCommand;

    public RemoteControl() {
        commands = new Command[7];
        for (int i = 0; i < commands.length; i++) {
            commands[i] = new NoCommand();
        }
    }

    public void setCommand(int pos, Command command) {
        commands[pos] = command;
    }

    public void pressButton(int pos) {
        commands[pos].execute();
        //记录执行命令
        unDoCommand = commands[pos];
    }

    public void pressUndo() {
        unDoCommand.undo();
    }
}
