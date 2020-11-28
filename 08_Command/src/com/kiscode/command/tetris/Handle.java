package com.kiscode.command.tetris;

/****
 * Description: Invoker角色：游戏操纵手柄
 * Author:  keno
 * CreateDate: 2020/11/28 10:44
 */
class Handle {
    //游戏手柄支持处理命令数量
    private final int COUNT_HANDLE = 4;

    private Command[] commands;

    public Handle() {
        //初始化默认命令
        this.commands = new Command[COUNT_HANDLE];
        for (int i = 0; i < commands.length; i++) {
            commands[i] = new NoCommand();
        }
    }

    public void setCommands(int pos, Command command) {
        this.commands[pos] = command;
    }

    public void press(int pos) {
        commands[pos].execute();
    }
}
