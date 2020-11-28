package com.kiscode.command.tetris;

/****
 * Description: Client 角色：游戏玩家
 * Author:  keno
 * CreateDate: 2020/11/28 10:48
 */
class Player {
    public static void main(String[] args) {
        //创建Receiver角色 俄罗斯方块游戏
        TetrisMachine tetrisMachine = new TetrisMachine();

        //根据游戏创建命令
        Command leftCommand = new LeftCommand(tetrisMachine);
        Command rightCommand = new RightCommand(tetrisMachine);
        Command transformCommand = new TransformCommand(tetrisMachine);
        Command fastToBottomCommand = new FastToBottomCommand(tetrisMachine);

        //Invoker角色 设置命令
        Handle handle = new Handle();
        handle.setCommands(0, leftCommand);
        handle.setCommands(1, rightCommand);
        handle.setCommands(2, transformCommand);
        handle.setCommands(3, fastToBottomCommand);

        //执行命令
        handle.press(0);
        handle.press(1);
        handle.press(2);
        handle.press(3);

        System.out.println("-------------------------------");

        //执行命令
        handle.press(3);
        handle.press(0);
        handle.press(0);
        handle.press(2);
        handle.press(2);
        handle.press(1);
    }
}
